/*-------------------------------------------------------------------------
 *
 * BaseConnection.java
 *	  The internal interface definition for a jdbc connection
 *
 * Copyright (c) 2003, PostgreSQL Global Development Group
 *
 * IDENTIFICATION
 *	  $Header$
 *
 *-------------------------------------------------------------------------
 */
package org.postgresql.core;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import org.postgresql.PGConnection;
import org.postgresql.PGNotification;

public interface BaseConnection extends PGConnection
{

	public void addNotification(PGNotification p_notification);
	public void addWarning(String msg);
	public void cancelQuery() throws SQLException;
	public Statement createStatement() throws SQLException;
	public BaseResultSet execSQL(String s) throws SQLException;
	public String getCursorName() throws SQLException;
	public Encoding getEncoding() throws SQLException;
	public DatabaseMetaData getMetaData() throws SQLException;
	public Object getObject(String type, String value) throws SQLException;
	public PGStream getPGStream();
	public String getPGType(int oid) throws SQLException;
	public int getPGType(String pgTypeName) throws SQLException;
	public int getSQLType(int oid) throws SQLException;
	public int getSQLType(String pgTypeName) throws SQLException;
	public boolean haveMinimumCompatibleVersion(String ver) throws SQLException;
	public boolean haveMinimumServerVersion(String ver) throws SQLException;
	public void setCursorName(String cursor) throws SQLException;

}

