package com.ezen.www.service;

import com.ezen.www.domain.BoardVO;
import com.ezen.www.repository.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    @Override
    public void register(BoardVO bvo) {
        boardMapper.register(bvo);
    }

    @Override
    public List<BoardVO> getList() {
        return boardMapper.getList();
    }

    @Override
    public BoardVO getDetail(long bno) {
        return boardMapper.getDetail(bno);
    }

    @Override
    public void modify(BoardVO bvo) {
        boardMapper.modify(bvo);
    }

    @Override
    public void remove(long bno) {
        boardMapper.remove(bno);
    }
}
