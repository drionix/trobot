/*
 * ~ TROBOT ~
 * 
 * $Id$
 */

package com.javaws.trobot;

import java.util.Map;

/**
 * 
 * @author jhsea3do
 * 
 */
public interface Trobot {

	String getId();

	void setId(String id);

	void init() throws Exception;

	void debug(String message, String fromCharset, String toCharset);

	void debug(String message);

	boolean isPlus();

	String getCookie();

	boolean login() throws Exception;

	InfoVillage getActiveVillage() throws Exception;

	void setActiveVillage(String did) throws Exception;

	InfoAllianz allianz(String uri) throws Exception;

	InfoAllianz allianz(int aid) throws Exception;

	InfoSpieler spieler(String uri) throws Exception;

	InfoSpieler spieler(int uid) throws Exception;

	InfoKarte karte(String uri) throws Exception;

	InfoKarte karte(String d, String c) throws Exception;

	Map<String, InfoVillage> getVillages();

	void run() throws Exception;

}