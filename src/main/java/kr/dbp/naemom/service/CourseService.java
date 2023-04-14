package kr.dbp.naemom.service;

import java.util.ArrayList;

import kr.dbp.naemom.vo.CourseVO;
import kr.dbp.naemom.vo.Hash_tagVO;
import kr.dbp.naemom.vo.ProductVO;

public interface CourseService {

	void insertCourse(CourseVO cos, String id);

	ArrayList<ProductVO> getSearchProduct(ProductVO pr);

	ArrayList<Hash_tagVO> getHashTag(int pd_num);

}
