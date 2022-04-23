package com.bithumb.msacommunity.repository;

import com.bithumb.msacommunity.domain.Community;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CommunityRepository extends ReactiveCrudRepository<Community, Integer> {
}
