package com.chenloveguitar.hellogit;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

import eu.medsea.mimeutil.MimeUtil;

public class HelloGit {
	public static void main(String[] args) throws Exception {
		File file = new File("F:/我的录像/2016-06-09 录制/视频2016-06-09 22.01.55.WMV");
		MimeUtil.registerMimeDetector("eu.medsea.mimeutil.detector.MagicMimeMimeDetector");    
        Collection<?> mimeTypes = MimeUtil.getMimeTypes(file);
        Iterator<?> iterator = mimeTypes.iterator();
        while(iterator.hasNext()){
        	System.out.println(iterator.next());
        }
	}
}
