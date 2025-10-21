package com.example.java.files;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadingATextFileOverInternet {

	private static final String FLOWER_FEED = "http://services.hanselandpetal.com/feeds/flowers.xml";

	public static void main(String[] args) throws IOException {

		InputStream stream = null;
		BufferedInputStream buf = null;

		try {
			URL url = new URL(FLOWER_FEED);
			stream = url.openStream();
			buf = new BufferedInputStream(stream);
			StringBuilder sb = new StringBuilder();
			while (true) {
				int data = buf.read();
				if (data == -1) {
					break;
				} else {
					sb.append((char)data);
				}
			}
			System.out.println(sb);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			stream.close();
			buf.close();
		}
	}

}
