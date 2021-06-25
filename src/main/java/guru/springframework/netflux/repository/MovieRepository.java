package guru.springframework.netflux.repository;

import guru.springframework.netflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository  extends ReactiveMongoRepository<Movie, String> {
}
