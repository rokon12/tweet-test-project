package com.codexplo.tweets.dao;


import java.util.List;

import com.codexplo.tweets.domain.Tweet;

public interface TweetDao {
	 // find - one

	Tweet findOne(final long id);

    /**
     * - contract: if nothing is found, an empty list will be returned to the calling client <br>
     */
    List<Tweet> findAll();

    /**
     * - contract: if nothing is found, an empty list will be returned to the calling client <br>
     */
    List<Tweet> findAllSorted(final String sortBy, final String sortOrder);

    /**
     * - contract: if nothing is found, an empty list will be returned to the calling client <br>
     */
    List<Tweet> findAllPaginated(final int page, final int size);

    /**
     * - contract: if nothing is found, an empty list will be returned to the calling client <br>
     */
    List<Tweet> findAllPaginatedAndSorted(final int page, final int size, final String sortBy, final String sortOrder);

    // create

    Tweet create(final Tweet resource);

    // update

    void update(final Tweet resource);

    // delete

    void delete(final long id);

    void deleteAll();

    // count

    long count();

    // search

    List<Tweet> searchAll(final String...searchItems );
    
    Tweet searchOne(final String...searchItems );

}
