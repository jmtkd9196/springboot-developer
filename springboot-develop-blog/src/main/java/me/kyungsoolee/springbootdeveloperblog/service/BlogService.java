package me.kyungsoolee.springbootdeveloperblog.service;

import lombok.RequiredArgsConstructor;
import me.kyungsoolee.springbootdeveloperblog.domain.Article;
import me.kyungsoolee.springbootdeveloperblog.dto.AddArticleRequest;
import me.kyungsoolee.springbootdeveloperblog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor    // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service    // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // 데이터베이스 글 모두 가져오는 메서드
    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
