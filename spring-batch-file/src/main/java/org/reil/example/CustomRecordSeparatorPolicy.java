package org.reil.example;

import org.springframework.batch.item.file.separator.SuffixRecordSeparatorPolicy;

public class CustomRecordSeparatorPolicy extends SuffixRecordSeparatorPolicy {
	
	private char delimiter = ',';
	
	@Override
	public String preProcess(String line) {
		line = line.trim() + delimiter;
		return super.preProcess(line);
	}

	public char getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(char delimiter) {
		this.delimiter = delimiter;
	}
	
}
