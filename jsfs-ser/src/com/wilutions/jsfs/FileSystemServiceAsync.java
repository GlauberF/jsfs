package com.wilutions.jsfs;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface FileSystemServiceAsync extends BRemote, 
	FileSystemService {
	/**
	 * List files in a directory.
	 * @param path Directory of path with wildcards * or ?
	 * @param findOptions unused
	 * @return List of files.
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.List<FileInfo> findFiles(java.lang.String path, FindOptions findOptions) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void findFiles(java.lang.String path, FindOptions findOptions, final BAsyncResult<java.util.List<FileInfo>> asyncResult) ;
	
	/**
	 * Read text file.
	 * Read all text content from the given file.
	 * @param path File path.
	 * @return Text content
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public java.lang.String readAllText(java.lang.String path) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void readAllText(java.lang.String path, final BAsyncResult<String> asyncResult) ;
	
	/**
	 * Write text file.
	 * Write the supplied text into the file. An existing file will be overwritten.
	 * @param path File path.
	 * @param text Text content
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public void writeAllText(java.lang.String path, java.lang.String text) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void writeAllText(java.lang.String path, java.lang.String text, final BAsyncResult<Object> asyncResult) ;
	
	/**
	 * Execute a program.
	 * If opts is null, the process is started synchronously. Otherwise it is started in background and
	 * the JSFS Agent will notify the caller via the {@link FileSystemNotify#notify(NotifyInfo)} function
	 * when the process has terminated.
	 * The first element in args[] is assumed to be the application name to be started. If only
	 * {@link ExecuteOptions#extraInfo} is set in opts, the first element in args can also be a
	 * file name. In this case the file is opened via ShellExecute with verb "open".
	 * @param args Arguments
	 * @param opts Options
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public void executeNotifyExit(java.lang.String[] args, ExecuteOptions opts) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void executeNotifyExit(java.lang.String[] args, ExecuteOptions opts, final BAsyncResult<Object> asyncResult) ;
	
	/**
	 * Begin watching a folder.
	 * Watch a folder and optional all sub-folders for changes.
	 * If a change occurs, the JSFS Agent invokes the {@link FileSystemNotify#notify(NotifyInfo)} function and
	 * passes a {@link WatchFolderNotifyInfo} object.
	 * @param dir Folder to be watched.
	 * @param recursive True, if sub-folders should also be watched.
	 * @param extraInfo Application defined value passed to the {@link NotifyInfo#extraInfo} element.
	 * @return Watch handle. Use this handle in {@link #endWatchFolder(int)} to stop watching the folder.
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public int beginWatchFolder(java.lang.String dir, boolean recursive, java.lang.String extraInfo) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void beginWatchFolder(java.lang.String dir, boolean recursive, java.lang.String extraInfo, final BAsyncResult<Integer> asyncResult) ;
	
	/**
	 * Stop watching a folder.
	 * Call this function to stop watching a folder and to release resources in the JSFS Agent.
	 * @param handle Watch handle returned from {@link #beginWatchFolder(String, boolean, String)}.
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public void endWatchFolder(int handle) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void endWatchFolder(int handle, final BAsyncResult<Object> asyncResult) ;
	
	/**
	 * Read file contents.
	 * Returns an input stream for reading the contents of the given file.
	 * @param path File path
	 * @return InputStream object
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public java.io.InputStream readFile(java.lang.String path) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void readFile(java.lang.String path, final BAsyncResult<java.io.InputStream> asyncResult) ;
	
	/**
	 * Upload files to the given URL using multipart/form-data encoding.
	 * @param items Form data items, file paths or name/value pairs.
	 * @param url Target URL. JSFS Agent should be authorized to send data to this URL.
	 * @param method HTTP method, can be POST or PUT. If this parameter is null or empty, method POST is used.
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public void uploadFilesMultipartFormdata(FormItem[] items, java.lang.String url, java.lang.String method) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void uploadFilesMultipartFormdata(FormItem[] items, java.lang.String url, java.lang.String method, final BAsyncResult<Object> asyncResult) ;
	
	/**
	 * Upload a file to the given URL.
	 * @param path Local file path from the view of JSFS agent.
	 * @param url Target URL. JSFS Agent should be authorized to send data to this URL.
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public void uploadFile(java.lang.String path, java.lang.String url) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void uploadFile(java.lang.String path, java.lang.String url, final BAsyncResult<Object> asyncResult) ;
	
	
}
