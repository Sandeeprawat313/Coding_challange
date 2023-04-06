package com.masi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masi.model.Entry;
import com.masi.service.EntryService;

@RestController
public class EntryController {
	@Autowired
	private EntryService Eservice;

	// create entry
	@PostMapping("/")
	public ResponseEntity<Entry> createEntryHandler(@RequestBody Entry entry) {

		Entry newEntry = Eservice.createEntry(entry);

		return new ResponseEntity<Entry>(newEntry, HttpStatus.CREATED);

	}

	@GetMapping("/entries")
	public ResponseEntity<List<Entry>> getAllEntriesHandler() {

		List<Entry> entries = Eservice.getAllEntries();

		return new ResponseEntity<List<Entry>>(entries, HttpStatus.OK);

	}

	@GetMapping("/random")
	public ResponseEntity<Entry> getrandomEntryHandler() {

		Entry entry = Eservice.getRandomEntry();

		return new ResponseEntity<Entry>(entry, HttpStatus.OK);

	}

	@GetMapping("/categories")
	public ResponseEntity<List<String>> getAllCategories() {

		List<String> categories = Eservice.getAllCategories();

		return new ResponseEntity<List<String>>(categories, HttpStatus.OK);

	}

	@GetMapping("/health")
	public ResponseEntity<String> getHelath() {

		return new ResponseEntity<String>("Application is running", HttpStatus.OK);

	}

}
