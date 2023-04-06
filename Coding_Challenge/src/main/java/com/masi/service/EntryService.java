package com.masi.service;

import java.util.List;

import com.masi.model.Entry;

public interface EntryService {

	public Entry createEntry(Entry myEntity);

	public List<Entry> getAllEntries();

	public Entry getRandomEntry();

	public List<String> getAllCategories();
}
