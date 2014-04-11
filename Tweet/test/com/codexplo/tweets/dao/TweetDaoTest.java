package com.codexplo.tweets.dao;

import java.util.List;

import org.junit.Test;

import com.codexplo.tweets.domain.Tweet;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TweetDaoTest {

	private TweetDao tweetDao;

	@Test
	public void search_noTweetEntriesFound_shouldReturnEmptyList() {
		List<Tweet> tweetList = tweetDao.searchAll("NOT_FOUND");
		
		assertThat(tweetList.size(), is(0));
	}
}
