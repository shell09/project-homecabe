package com146.HOME.CA.BE.domain.common.category;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class CategoryDAOImplTest {

  @Autowired
  private CategoryDAO categoryDAO;

  @Test
  @DisplayName("하위 코드 반환")
  void category() {
    int pcate = 30;

    List<Category> sub = categoryDAO.category(pcate);
    Assertions.assertThat(sub.size()).isEqualTo(2);
    log.info("sub={}", sub);
  }

  @Test
  @DisplayName("일반 게시판 하위 코드 반환")
  void testCategory() {
    List<Category> board = categoryDAO.category();
    Assertions.assertThat(board.size()).isEqualTo(13);
    log.info("subCode={}", board);

  }

  @Test
  @DisplayName("모든 코드 반환")
  void categoryAll() {
    List<CategoryAll> categoryAlls = categoryDAO.categoryAll();
    log.info("categoryAlls={}",categoryAlls);
  }
}