package com.wilutions.jsfs;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_FileSystemService extends BStub implements FileSystemServiceAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 145996442L;
	
	public BStub_FileSystemService(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.List<FileInfo> findFiles(java.lang.String path, FindOptions findOptions) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.List<FileInfo>> asyncResult = new BSyncResult<java.util.List<FileInfo>>();		
		findFiles(path, findOptions, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void findFiles(java.lang.String path, FindOptions findOptions, final BAsyncResult<java.util.List<FileInfo>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_findFiles req = new BRequest_FileSystemService_findFiles();		
		req.path = path;
		req.findOptions = findOptions;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.lang.String readAllText(java.lang.String path) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<String> asyncResult = new BSyncResult<String>();		
		readAllText(path, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void readAllText(java.lang.String path, final BAsyncResult<String> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_readAllText req = new BRequest_FileSystemService_readAllText();		
		req.path = path;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void writeAllText(java.lang.String path, java.lang.String text) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		writeAllText(path, text, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void writeAllText(java.lang.String path, java.lang.String text, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_writeAllText req = new BRequest_FileSystemService_writeAllText();		
		req.path = path;
		req.text = text;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void executeNotifyExit(java.lang.String[] args, ExecuteOptions opts) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		executeNotifyExit(args, opts, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void executeNotifyExit(java.lang.String[] args, ExecuteOptions opts, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_executeNotifyExit req = new BRequest_FileSystemService_executeNotifyExit();		
		req.args = args;
		req.opts = opts;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public int beginWatchFolder(java.lang.String dir, boolean recursive, java.lang.String extraInfo) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Integer> asyncResult = new BSyncResult<Integer>();		
		beginWatchFolder(dir, recursive, extraInfo, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void beginWatchFolder(java.lang.String dir, boolean recursive, java.lang.String extraInfo, final BAsyncResult<Integer> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_beginWatchFolder req = new BRequest_FileSystemService_beginWatchFolder();		
		req.dir = dir;
		req.recursive = recursive;
		req.extraInfo = extraInfo;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void endWatchFolder(int handle) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		endWatchFolder(handle, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void endWatchFolder(int handle, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_endWatchFolder req = new BRequest_FileSystemService_endWatchFolder();		
		req.handle = handle;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.io.InputStream readFile(java.lang.String path) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.io.InputStream> asyncResult = new BSyncResult<java.io.InputStream>();		
		readFile(path, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void readFile(java.lang.String path, final BAsyncResult<java.io.InputStream> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_readFile req = new BRequest_FileSystemService_readFile();		
		req.path = path;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void uploadFilesMultipartFormdata(FormItem[] items, java.lang.String url, java.lang.String method) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		uploadFilesMultipartFormdata(items, url, method, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void uploadFilesMultipartFormdata(FormItem[] items, java.lang.String url, java.lang.String method, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_uploadFilesMultipartFormdata req = new BRequest_FileSystemService_uploadFilesMultipartFormdata();		
		req.items = items;
		req.url = url;
		req.method = method;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void uploadFile(java.lang.String path, java.lang.String url) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		uploadFile(path, url, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void uploadFile(java.lang.String path, java.lang.String url, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_FileSystemService_uploadFile req = new BRequest_FileSystemService_uploadFile();		
		req.path = path;
		req.url = url;
		transport.sendMethod(req, asyncResult);
	}
	
	
}
