package eu.monnetproject.translation.util;

import eu.monnetproject.lang.Language;

public interface CLSim {
	public double score(String text1, Language lang1, String text2, Language lang2);
	public void close();
}
