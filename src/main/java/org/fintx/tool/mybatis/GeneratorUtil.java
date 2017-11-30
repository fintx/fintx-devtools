package org.fintx.tool.mybatis;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorUtil {
	public static void execute(String[] args) {

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		// /generatorConfig_report.xml;
		String genCfg = "/MapperGenerate/generatorConfig_core_ledgers.xml;";
		// String genCfg =
		// "/MapperGenerate/generatorConfig_core_customers.xml;/MapperGenerate/generatorConfig_core_jobbatches.xml;/MapperGenerate/generatorConfig_core_ledgers.xml;/MapperGenerate/generatorConfig_core_sys.xml";
		String[] str = genCfg.split(";");
		for (int j = 0; j < str.length; j++) {
			File configFile = new File(GeneratorUtil.class.getResource(str[j]).getFile());
			System.out.println(GeneratorUtil.class.getResource(str[j]).getFile() + "----------------" + configFile.exists());
			// File configFile = new
			// File("C:/Users/windows/workspace/Mybatis/lib/generatorConfig.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = null;
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = null;
			try {
				config = cp.parseConfiguration(configFile);
				myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
				myBatisGenerator.generate(null);
				System.out.println("create success!!!");
				for (int i = 0; i < warnings.size(); i++) {
					System.out.println(warnings.get(i));
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (XMLParserException e) {
				e.printStackTrace();
			} catch (InvalidConfigurationException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
//	
//	public static void main( String[] args )
//    {
//	    execute(String[] args) 
//    }
}
