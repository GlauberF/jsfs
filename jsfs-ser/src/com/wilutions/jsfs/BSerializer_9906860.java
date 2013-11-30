package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.WatchFolderNotifyInfo
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_9906860 extends com.wilutions.jsfs.BSerializer_1274131736 {
	
	public final static BSerializer instance = new BSerializer_9906860();
	
	public BSerializer_9906860() {
		super(9906860);
	}
	
	public BSerializer_9906860(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final WatchFolderNotifyInfo obj = (WatchFolderNotifyInfo)obj1;		
		super.write(obj, bout1, version);		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.kind!=null ? obj.kind.ordinal() : 0);
		bout.writeObj(obj.fileInfo, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final WatchFolderNotifyInfo obj = (WatchFolderNotifyInfo)(obj1 != null ? obj1 : bin.onObjectCreated(new WatchFolderNotifyInfo()));
		
		// Read base class members
		super.read(obj, bin, version);
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.kind = BEnumHelper.fromOrdinal(com.wilutions.jsfs.EWatchFolderNotifyKind.values(), bbuf.getInt());
		obj.fileInfo = (com.wilutions.jsfs.FileInfo)bin.readObj(false, null);
		
		return obj;
	}
	
}