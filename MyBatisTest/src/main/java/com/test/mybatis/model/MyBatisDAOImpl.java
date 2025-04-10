package com.test.mybatis.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyBatisDAOImpl implements MyBatisDAO {

	// JDBC 설정 > MyBatis 설정
	private final SqlSessionTemplate template;

//	public MyBatisDAOImpl(SqlSessionTemplate template) {
//		this.template = template;
//	}

	/*
	 * 
	 * MyBatis > Mapper XML을 사용해서 SQL를 XML에 작성한다.
	 * 
	 * int stat.executeUpdate() - 반환값이 없는 쿼리 - int template.insert(XML매퍼네이스페이스.ID) -
	 * int template.update() - int template.delete()
	 * 
	 * ResultSet stat.executeQuery() - 반환값이 있는 쿼리 - template.selectOne() > 결과셋의 레코드
	 * 1개 - template.selectList() > 결과셋의 레코드 N개
	 * 
	 */

	@Override
	public void m1() {

		// 반환값(X), 인자값(X)
		template.insert("mybatis.m1");

	}

	@Override
	public int m2(String seq) {
		// 반환값(X), 인자값(O)
		return template.delete("mybatis.m2", seq);

	}

	@Override
	public int m3(HashMap<String, String> map) {

		// 반환값(X), 인자값(O)
		return template.update("mybatis.m3", map);
	}

	@Override
	public int m4(AddressDTO dto) {

		// 반환값(X), 인자값(O)
		return template.insert("mybatis.m4", dto);
	}

	@Override
	public int m5() {

		// 반환값(O), 인자값(X)
		// - 단일값 반환(1행 1열)
		return template.selectOne("mybatis.m5");
	}

	@Override
	public AddressDTO m6(String seq) {

		/*
		 * 
		 * try { String sql = "select.."; pstat = conn.prepareSt..(sql)
		 * pstat.setString(1, seq); rs = pstat.executeQuery(); if (rs.next()) {
		 * AddressDTO dto = ..; dto.setSeq(rs.getString("seq")); dto.set.. dto.set..
		 * return dto; } }
		 */

		// select > 레코드(오라클 데이터) > 매핑 > AddressDTO(자바 데이터)
		return template.selectOne("mybatis.m6", seq);
	}

	@Override
	public List<String> m7() {

		/*
		 * 
		 * try { String sql = "sele.. stat = conn.cre.. rs = stat.executeQuery()
		 * List<String> while <rs.next()) { //레코드 1줄 > DTO 1개
		 * list.add(rs.getString("name")); } return list; }
		 * 
		 * 
		 * 
		 */

		return template.selectList("mybatis.m7");
	}

	@Override
	public List<AddressDTO> m8() {
		return template.selectList("mybatis.m8");
	}

	@Override
	public int m9(String tableName) {
		return template.selectOne("mybatis.m9", tableName);
	}
	
	@Override
	public List<AddressDTO> m10(int age) {
		return template.selectList("mybatis.m10", age);
	}
	
	@Override
	public List<AddressDTO> m11(String word) {
		return template.selectList("mybatis.m11", word);
	}
	
	@Override
	public List<AddressDTO> m12(String gender) {
	    Map<String, Object> map = new HashMap<>();
	    map.put("gender", gender); // key 이름이 XML에서 쓰는 이름과 일치해야 함
	    return template.selectList("mybatis.m12", map);
	}

	
}
