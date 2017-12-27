//package org.qhs.myselfSites.dome.controller;
//
//import feign.jaxb.JAXBContextFactory;
//import org.qhs.myselfSites.dome.feign.JsonClient;
//import org.qhs.myselfSites.dome.feign.XmlClient;
//import org.qhs.myselfSites.dome.xmlentity.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import java.io.IOException;
//import java.io.StringWriter;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//@RestController
//@RequestMapping("applInfoBizController")
//public class feignController {
//	@Autowired
//	private XmlClient xmlClient;
//	@Autowired
//	private JsonClient jsonClient;
//
//	public  static String objectToXml(Object value) {
//		String str = null;
//		JAXBContext context = null;
//		StringWriter writer = null;
//		try {
//			context = JAXBContext.newInstance(value.getClass());
//			Marshaller mar = context.createMarshaller();
//			writer = new StringWriter();
//			mar.marshal(value, writer);
//			str = writer.toString().replace("getProductRequest", "GetProductRequest");
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}finally {
//			if(context != null) context = null;
//			if(writer != null) {
//				try {
//					writer.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				writer = null;
//			}
//		}
//		return str;
//	}
//
//	@RequestMapping(value = "/json")
//	public void json() {
////		TransData transData = jsonClient.reqCheck(getObject());
////		printResult(transData);
//	}
//
//	@RequestMapping(value = "/xml")
//	public void xml() {
//		TransData transData =  xmlClient.reqCheck(getObject());
//		printResult(transData);
//	}
//
//	@RequestMapping(value = "/createXMLPerson")
//	public String createXMLPerson() {
//	//	JAXBContextFactory jaxbFactory = new JAXBContextFactory.Builder().build();
////		iHttpClient = Feign.builder()
////				.encoder(new JAXBEncoder(jaxbFactory))//编码器
//////				.decoder(new GsonDecoder())
//////				.encoder(new GsonEncoder())
////				.decoder(new JAXBDecoder(jaxbFactory))//解码器
////				.target(IHttpClient.class, "http://172.16.10.238:8081/");
//		TransData TRANSDATA = getObject();
//		TransData transData = xmlClient.reqCheck(TRANSDATA);
//
//		printResult(transData);
//		//调用接口并返回结果
////		transData.setTransHead(transData.getTransHead());
////		System.out.println(transData.getTransHead());
//		return "";
//	}
//
//	private void printResult(TransData transData) {
//		Set<TransType> transHead = transData.getTransHead();
//		Iterator<TransType> iterator = transHead.iterator();
//		TransType transType1 =null;
//		while (iterator.hasNext()){
//			transType1 = iterator.next();
//		}
//		TransType.Return aReturn = transType1.getReturn();
//		System.out.println(aReturn);
//	}
//
//	private TransData getObject() {
//		TransData TRANSDATA = new TransData();
//		TransType transType = new TransType();
//		transType.setOutServiceCode("/<>?");
//		transType.setTransExeDate("2017-11-10 08:10:31");
//		transType.setTransSerialNo("7a8fd265-c109-4b59-b61a-c1b659f8b01e");
//		transType.setTransType("90012");
//		Set<TransType> set=new HashSet();
//		set.add(transType);
//		Item item=new Item();
//		item.setName("MER_APPLY_RESULT");
//		item.setValue("Y");
//		Condition condition=new Condition();
//		condition.setItem(item);
//		TransBody transBody=new TransBody();
//		transBody.setCondition(condition);
//		transBody.setBASQBH("4119757");
//		Set<TransBody> set1=new HashSet();
//		set1.add(transBody);
//
//		TRANSDATA.setTransBody(set1);
//		TRANSDATA.setTransHead(set);
//		return TRANSDATA;
//	}
//}
