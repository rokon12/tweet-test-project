package com.codexplo.tweets.dao;

import java.util.List;

import com.codexplo.tweets.domain.Tweet;

public class TweetDaoImpl implements TweetDao{

	@Override
	public Tweet findOne(long id) {
		return null;
	}

	@Override
	public List<Tweet> findAll() {
		return null;
	}

	@Override
	public List<Tweet> findAllSorted(String sortBy, String sortOrder) {
		return null;
	}

	@Override
	public List<Tweet> findAllPaginated(int page, int size) {
		return null;
	}

	@Override
	public List<Tweet> findAllPaginatedAndSorted(int page, int size,
			String sortBy, String sortOrder) {
		return null;
	}

	@Override
	public Tweet create(Tweet resource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Tweet resource) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Tweet> searchAll(String... searchItems) {
		return null;
	}

	@Override
	public Tweet searchOne(String... searchItems) {
		return null;
	}

}
