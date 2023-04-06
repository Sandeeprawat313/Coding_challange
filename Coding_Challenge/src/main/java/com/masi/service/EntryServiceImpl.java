package com.masi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masi.model.Entry;
import com.masi.repository.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository eDao;

	@Override
	public Entry createEntry(Entry myEntity) {

		return eDao.save(myEntity);
	}

	@Override
	public List<Entry> getAllEntries() {
		return eDao.findAll();
	}

	@Override
	public Entry getRandomEntry() {
		List<Entry> entries = eDao.findAll();
		Integer random = new Random().nextInt(entries.size());

		return entries.get(random);
	}

	@Override
	public List<String> getAllCategories() {
		List<Entry> entries = eDao.findAll();
		List<String> categories = new ArrayList<>();

		for (Entry e : entries) {
			if (!categories.contains(e.getCategory())) {
				categories.add(e.getCategory());
			}
		}
		return categories;
	}

}
