package team18.airbnb.search;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final SearchRepository searchRepository;
}
