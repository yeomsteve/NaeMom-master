package kr.dbp.naemom.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.dbp.naemom.pagination.Criteria;
import kr.dbp.naemom.vo.CourseItemVO;
import kr.dbp.naemom.vo.CourseVO;
import kr.dbp.naemom.vo.FileVO;
import kr.dbp.naemom.vo.Hash_tagVO;
import kr.dbp.naemom.vo.LikeVO;
import kr.dbp.naemom.vo.ProductCategoryVO;
import kr.dbp.naemom.vo.ProductVO;
import kr.dbp.naemom.vo.ReportVO;

public interface CourseDAO {

	int insertCourse(@Param("cos")CourseVO cos,@Param("id")String id);

	ArrayList<ProductVO> selectSearchProduct(@Param("pr")ProductVO pr);

	ArrayList<Hash_tagVO> selectHashTag(@Param("pd_num")int pd_num);

	ProductVO selectProductNum(@Param("pd_num")int pd_num);

	void insertCourseItem(@Param("co_num")int co_num, @Param("pd_num")int pr_num,  @Param("index")int index);

	ArrayList<ProductCategoryVO> selectProductCategory();

	FileVO selectProductImg(@Param("pd_num")int pd_num, @Param("fi_category")String fi_category, @Param("fi_table")String fi_table);

	ArrayList<CourseVO> selectCourseList(@Param("cri")Criteria cri);

	int selectTotalCountCourse(@Param("cri")Criteria cri);

	ArrayList<CourseItemVO> selectCourseItem(@Param("co_num")int co_num);

	ArrayList<FileVO> selectProductImgList(@Param("fi_category")String fi_category, @Param("fi_table")String fi_table);

	CourseVO selectCourseByNum(@Param("co_num")int co_num);

	void deleteCourseItem(@Param("ci_co_num")int ci_co_num);

	int deleteCourse(@Param("co_num")int co_num);

	int updateCourse(@Param("cos")CourseVO cos, @Param("id")String id, @Param("co_num")int co_num);

	LikeVO selectLike(@Param("li_co_num")int li_co_num, @Param("me_id")String me_id, @Param("table")String table);

	void insertLike(@Param("li")LikeVO likeVo);

	void updateLike(@Param("li")LikeVO likeVo);

	void updateCourseUpAndDown(@Param("li_co_num")int li_co_num);

	int insertReportCourse(@Param("rep")ReportVO rep);

	void updateCourseByReport(@Param("co_num")int co_num);

	int selectReportById(@Param("rep")ReportVO rep);

	void updateViewCount(@Param("co_num")int co_num);

}
