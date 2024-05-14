package com.ezen.www.repository;

import com.ezen.www.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void register(BoardVO bvo);

    List<BoardVO> getList();

    BoardVO getDetail(long bno);

    void modify(BoardVO bvo);

    void remove(long bno);
}
