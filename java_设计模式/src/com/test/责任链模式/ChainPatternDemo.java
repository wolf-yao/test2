package com.test.������ģʽ;




//��ͼ��������������������������һ���ö�������п��ܽ������󣬽���Щ�������ӳ�һ����������������������������ֱ���ж�������Ϊֹ��
//��Ҫ�����ְ�����ϵĴ����߸��������󣬿ͻ�ֻ��Ҫ�������͵�ְ�����ϼ��ɣ������������Ĵ���ϸ�ں�����Ĵ��ݣ�����ְ����������ķ����ߺ�����Ĵ����߽����ˡ�
//��ʱʹ�ã��ڴ�����Ϣ��ʱ���Թ��˺ܶ����
//��ν�������ص��඼ʵ��ͳһ�ӿڡ�
//�ؼ����룺Handler ����ۺ����Լ����� HanleRequest ���ж��Ƿ���ʣ����û�ﵽ���������´��ݣ���˭����֮ǰ set ��ȥ��
//Ӧ��ʵ���� 1����¥���е�"���Ĵ���"�� 2��JS �е��¼�ð�ݡ� 3��JAVA WEB �� Apache Tomcat �� Encoding �Ĵ���Struts2 ����������jsp servlet �� Filter��
//�ŵ㣺 1��������϶ȡ���������ķ����ߺͽ����߽�� 2�����˶���ʹ�ö�����Ҫ֪�����Ľṹ�� 3����ǿ������ָ��ְ�������ԡ�ͨ���ı����ڵĳ�Ա���ߵ������ǵĴ�������̬����������ɾ�����Ρ� 4�������µ���������ܷ��㡣
//ȱ�㣺 1�����ܱ�֤����һ�������ա� 2��ϵͳ���ܽ��ܵ�һ��Ӱ�죬�����ڽ��д������ʱ��̫���㣬���ܻ����ѭ�����á� 3�����ܲ����׹۲�����ʱ���������а��ڳ���
//ʹ�ó����� 1���ж��������Դ���ͬһ�����󣬾����ĸ������������������ʱ���Զ�ȷ���� 2���ڲ���ȷָ�������ߵ�����£����������е�һ���ύһ������ 3���ɶ�ָ̬��һ�����������
//ע������� JAVA WEB �������ܶ�Ӧ�á�


public class ChainPatternDemo {
    
	   private static AbstractLogger getChainOfLoggers(){

	      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
	      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);

	      return errorLogger;    
	   }

	   public static void main(String[] args) {
	      AbstractLogger loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	   }
	}