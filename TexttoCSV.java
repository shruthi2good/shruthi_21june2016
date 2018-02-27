package txt2csv;

import java.io.*;
import java.util.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.hssf.usermodel.HSSFRow;


public class TexttoCSV {
	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked", "resource" })
	public static void main(String[] args) {
		//Logger logger = Logger.getLogger(TexttoCSV.class);
		//BasicConfigurator.configure();
		//logger.info("This is my first log4j's statement");
		try{
		
			FileInputStream fstream = new FileInputStream("D:\\shruthi_pers\\Sydney_resume\\New\\work_exp_res\\Adap's\\Evolution_OLI_ABN_AMRO\\Input.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			ArrayList list=new ArrayList();
			while ((strLine = br.readLine()) != null){
			list.add(strLine);
			}
			

			Iterator itr;

			


			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("Client Information");
			//String sheetc=sheet.toString();
			HSSFSheet sheet1=wb.createSheet("Product Information");
			HSSFSheet sheet2=wb.createSheet("Total Transaction Amount");
		
		if(sheet!=null){
			createClientInfo(sheet,list);
			}
			
			if(sheet1!=null){
				createProductInfo(sheet1,list);
				
			}
			if(sheet2!=null){
				createTransactionInfo(sheet2,list);
	
				
			}
			

		//	FileOutputStream fileOut = new FileOutputStream("c:\\TextToCSV.xls");
			FileOutputStream fileOut = new FileOutputStream("D:\\shruthi_pers\\Sydney_resume\\New\\work_exp_res\\Adap's\\Evolution_OLI_ABN_AMRO\\Output.csv");
			wb.write(fileOut);
			fileOut.close();
			System.out.println("Data is saved in excel file.");
			}
			catch(Exception e){System.out.println(e);}
			}

	public static void createClientInfo(HSSFSheet sheet, ArrayList list) {
		HSSFRow rowhead = sheet.createRow((short)0);		
		rowhead.createCell((short)0).setCellValue("CLIENT TYPE");
		rowhead.createCell((short)1).setCellValue("CLIENT NUMBER");
		rowhead.createCell((short)2).setCellValue("ACCOUNT NUMBER");
		rowhead.createCell((short)3).setCellValue("SUBACCOUNT NUMBER");

		int index=1;
		Iterator itr;
		for (itr=list.iterator(); itr.hasNext(); ){
		String str=itr.next().toString();
		//System.out.println("Printing Str"+str);
		//logger.info("Printing String"+str);
		String trimwhitespace=str.replaceAll("\\s+","");
		System.out.println("Printing trimwhitespace"+trimwhitespace);
		String ClientType=trimwhitespace.substring(3,7);
		//String ClientTypeFinal=ClientType.replaceAll("\\s+","");
		System.out.println("printing ClientType"+ClientType);
		String ClientNumber=trimwhitespace.substring(7, 11);
		String AccNum=trimwhitespace.substring(11,15);
		String SubAccNum=trimwhitespace.substring(15, 19);
	
		HSSFRow row = sheet.createRow((short)index);
		row.createCell((short)0).setCellValue(ClientType);
		row.createCell((short)1).setCellValue(ClientNumber);
		row.createCell((short)2).setCellValue(AccNum);
		row.createCell((short)3).setCellValue(SubAccNum);
		index++;
		}

		// TODO Auto-generated method stub
		
	}

	public static void createTransactionInfo(HSSFSheet sheet2, ArrayList list) {
		// TODO Auto-generated method stub
		System.out.println("Inside Total_Transaction_Amount");
		HSSFRow rowhead2 = sheet2.createRow((short)0);
		rowhead2.createCell((short)0).setCellValue("QUANTITY LONG");
		rowhead2.createCell((short)1).setCellValue("QUANTITY SHORT");
		rowhead2.createCell((short)2).setCellValue("QUANTITY LONG-QUANTITY SHORT");
		
		Iterator itr;
		int index=1;
		for (itr=list.iterator(); itr.hasNext(); ){
				String str=itr.next().toString();
				System.out.println("Printing Str"+str);
				String trimwhitespace=str.replaceAll("\\s+","");
				System.out.println("Printing trimwhitespace"+trimwhitespace);
				String QuantityLong=trimwhitespace.substring(52,62);
				//String ClientTypeFinal=ClientType.replaceAll("\\s+","");
				System.out.println("printing QuantityLong"+QuantityLong);
				String QuantityShort=trimwhitespace.substring(63,73);
				try{
						int QL=Integer.parseInt(QuantityLong);
						int QS=Integer.parseInt(QuantityShort);
						
						int q=QL-QS;
						System.out.println("Printing result"+q);
						String result=Integer.toString(q);
						
						
				
			
				HSSFRow row = sheet2.createRow((short)index);
				row.createCell((short)0).setCellValue(QL);
				row.createCell((short)1).setCellValue(QS);
				row.createCell((short)2).setCellValue(q);
				
				
				
				
				index++;
				}catch(NumberFormatException ex)
				{
					ex.printStackTrace();
				}
		}
	}

	public static void createProductInfo(HSSFSheet sheet1, ArrayList list) {
		// TODO Auto-generated method stub
		System.out.println("Inside ProductInformation");
		HSSFRow rowhead1 = sheet1.createRow((short)0);
		rowhead1.createCell((short)0).setCellValue("EXCHANGE CODE");
		rowhead1.createCell((short)1).setCellValue("PRODUCT GROUP CODE");
		rowhead1.createCell((short)2).setCellValue("SYMBOL");	
		
		rowhead1.createCell((short)3).setCellValue("EXPIRATION DATE");
		
		int index=1;
		Iterator itr;
		for (itr=list.iterator(); itr.hasNext(); ){
				String str=itr.next().toString();
				System.out.println("Printing Str"+str);
				String trimwhitespace=str.replaceAll("\\s+","");
				System.out.println("Printing trimwhitespace"+trimwhitespace);
				String ExchangeCode=trimwhitespace.substring(27,31);
				//String ClientTypeFinal=ClientType.replaceAll("\\s+","");
				System.out.println("printing ExchangeCode"+ExchangeCode);
				String ProductGroupCode=trimwhitespace.substring(25, 27);
				String Symbol=trimwhitespace.substring(31,37);
				String ExpirationDate=trimwhitespace.substring(37, 45);
			
				HSSFRow row = sheet1.createRow((short)index);
				row.createCell((short)0).setCellValue(ExchangeCode);
				row.createCell((short)1).setCellValue(ProductGroupCode);
				row.createCell((short)2).setCellValue(Symbol);
				row.createCell((short)3).setCellValue(ExpirationDate);
				index++;
		}
		
		
	}

	

	
	}


