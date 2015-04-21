package hello.container;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.fs.FsShell;
import org.springframework.yarn.annotation.OnContainerStart;
import org.springframework.yarn.annotation.YarnComponent;

//YarnComponent tiene un @Configuration por dentro. Marca la clase
//como teniendo funcionalidad de YarnContainer
@YarnComponent
public class HelloPojo {

	private static final Log log = LogFactory.getLog(HelloPojo.class);

	@Autowired
	private Configuration configuration;

	//OnContainerStart anota al método como punto de entrada para ser ejecutado
	//dentro de Hadoop
	@OnContainerStart
	public void publicVoidNoArgsMethod() throws Exception {
		log.info("Hello from HelloPojo");
		log.info("About to list from hdfs root content");

		//Lista las entradas dentro del sistema de archivos HDFS
		FsShell shell = new FsShell(configuration);
		for (FileStatus s : shell.ls(false, "/")) {
			log.info(s);
		}
		shell.close();
	}

}
