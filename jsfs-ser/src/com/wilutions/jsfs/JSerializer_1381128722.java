package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.FileSystemServiceC
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_1381128722 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1381128722();
	
	public JSerializer_1381128722() {
		super(1381128722);
	}
	
	public JSerializer_1381128722(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final FileSystemServiceC obj = (FileSystemServiceC)obj1;		
		bbuf.putString("FOLDERID_Documents", obj.FOLDERID_Documents);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final FileSystemServiceC obj = (FileSystemServiceC)(obj1 != null ? obj1 : bin.onObjectCreated(new FileSystemServiceC()));
		
		final BJsonObject js = bin.currentObject;
		
		return obj;
	}
	
}
