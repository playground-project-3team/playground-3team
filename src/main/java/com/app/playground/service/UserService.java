package com.app.playground.service;

import com.app.playground.domain.VO.UserVO;
import org.apache.catalina.User;

import java.util.Optional;

public interface UserService {
//    회원가입
    public void join(UserVO userVO, Long id);

//    로그인
    public Optional<UserVO> login(UserVO userVO);

//    회원 정보 조회
    public Optional<UserVO> getUser(String userEmail);

//    카카오회원정보조회
    public Optional<UserVO> getKakaoUser(String userKakaoEmail);

//    회원 아이디로 조회
    public Optional<UserVO> getUserById(Long id);

    //    카카오 프사 수정
    public void updateKakoProfile(UserVO userVO);

    //    연동하기
    public void synchronize(UserVO userVO);

    //    회원 삭제
    public void delete(Long id);

    //    카카오 회원 정보 추가
    public void updateInfo(UserVO userVO);


}
