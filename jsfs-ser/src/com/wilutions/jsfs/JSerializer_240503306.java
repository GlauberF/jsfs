package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BRequest_FileSystemService_uploadFilesMultipartFormdata
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_240503306 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_240503306();
	
	public JSerializer_240503306() {
		super(240503306);
	}
	
	public JSerializer_240503306(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_FileSystemService_uploadFilesMultipartFormdata obj = (BRequest_FileSystemService_uploadFilesMultipartFormdata)obj1;		
		bbuf.putString("method", obj.method);
		bbuf.putString("url", obj.url);
		bout.writeObj("items",obj.items, false, com.wilutions.jsfs.JSerializer_566696346.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_FileSystemService_uploadFilesMultipartFormdata obj = (BRequest_FileSystemService_uploadFilesMultipartFormdata)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_FileSystemService_uploadFilesMultipartFormdata()));
		
		final BJsonObject js = bin.currentObject;
		obj.method = js.getString("method");
		obj.url = js.getString("url");
		obj.items = (com.wilutions.jsfs.FormItem[])bin.readObj("items", false, com.wilutions.jsfs.JSerializer_566696346.instance);
		
		return obj;
	}
	
}