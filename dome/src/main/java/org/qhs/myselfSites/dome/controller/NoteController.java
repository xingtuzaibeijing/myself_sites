package org.qhs.myselfSites.dome.controller;//package org.qhs.controller;
//
//
//import org.qhs.sendnote.SendNoteRpcQz;
//import org.qhs.xmlentity.*;
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
//import java.util.UUID;
//
///**
// * @author qianh
// */
//@RestController
//@RequestMapping("applInfoBizController")
//public class NoteController {
//    //	@Autowired
////	private IHttpClientXml iHttpClientXml;
//    @Autowired
//    private SendNoteRpc SendNoteRpc;
//    @Autowired
//    private SendNoteRpcQz sendNoteRpcQz;
//    /**
//     *@Description:测试xml格式controller 目标短信接口
//     *@Author:QianHuaSheng
//     *@Param:[]
//     *@Date: 2017/11/14 15:51
//     *@Return:java.lang.String
//     */
//    @RequestMapping(value = "/createXMLPerson")
//    public String createXMLPerson() {
////		JAXBContextFactory jaxbFactory = new JAXBContextFactory.Builder().build();
////		iHttpClient = Feign.builder()
////				.encoder(new JAXBEncoder(jaxbFactory))//编码器
//////				.decoder(new GsonDecoder())
//////				.encoder(new GsonEncoder())
////				.decoder(new JAXBDecoder(jaxbFactory))//解码器
////				.target(IHttpClient.class, "http://172.16.10.238:8081/");
//        TransData TRANSDATA = new TransData();
//        TransType transType = new TransType();
//        transType.setOutServiceCode("0bb1396ba84d4945b73d0d17b3fa2418");
//        transType.setTransExeDate("2017-11-10 08:10:31");
//        transType.setTransSerialNo("7a8fd265-c109-4b59-b61a-c1b659f8b01e");
//        transType.setTransType("90012");
//        Set<TransType> set=new HashSet();
//        set.add(transType);
//        Item item=new Item();
//        item.setName("MER_APPLY_RESULT");
//        item.setValue("Y");
//        Condition condition=new Condition();
//        condition.setItem(item);
//        TransBody transBody=new TransBody();
//        transBody.setCondition(condition);
//        transBody.setBASQBH("4119757");
//        Set<TransBody> set1=new HashSet();
//        set1.add(transBody);
//
//        TRANSDATA.setTransBody(set1);
//        TRANSDATA.setTransHead(set);
//        TransData transData = SendNoteRpc.reqCheck(TRANSDATA);
//
//        Set<TransType> transHead = transData.getTransHead();
//        Iterator<TransType> iterator = transHead.iterator();
//        TransType transType1 =null;
//        while (iterator.hasNext()){
//            transType1 = iterator.next();
//        }
//        TransType.Return aReturn = transType1.getReturn();
//        System.out.println(aReturn);
//        //调用接口并返回结果
////		transData.setTransHead(transData.getTransHead());
////		System.out.println(transData.getTransHead());
//        return "";
//    }
//    /**
//     *@Description:邮寄邮件
//     *@Author:QianHuaSheng
//     *@Param:[]
//     *@Date: 2017/11/15 16:39
//     *@Return:java.lang.String
//     */
//    @RequestMapping(value = "/sendNote")
//    public String sendNote() {
//        Root root=new Root();
//        NoteBody noteBody =new NoteBody();
//        Head Head =new Head();
//
//        //body
//        noteBody.setOperator("10000001");
//        NoteBody.msg msgs=new NoteBody.msg();
//        NoteBody.msg msgs2=new NoteBody.msg();
//        msgs.setMsgNo("2016081200001");
//        msgs.setTempletId("0001");
//        msgs.setPhone("17621067724");
//        msgs.setContent("亲爱的用户您好");
//
//        msgs2.setMsgNo("2016081200001");
//        msgs2.setTempletId("0030");
//        msgs2.setPhone("17621067724");
//        msgs2.setContent("亲爱的用户您好!");
//        Set<NoteBody.msg> msgss = new HashSet<NoteBody.msg>();
//        msgss.add(msgs2);
//        msgss.add(msgs);
//        noteBody.setMsgss(msgss);
//        //head
//        Head.setSEQNO(UUIDUtil.getUUID());
//        Head.setSERVICECODE("sendShortMessage");
//        Head.setCHANNELID("YWXT");
//        Head.setSENDTIME("20160630163701");
//        root.setBody(noteBody);
//        root.setHead(Head);
//        Root root1 = sendNoteRpcQz.sendNote(root);
//        System.out.println(root1);
//        return "";
//    }
//    /**
//     *@Description:查询二手车价格：
//     *@Author:QianHuaSheng
//     *@Param:[]
//     *@Date: 2017/11/16 10:55
//     *@Return:java.lang.String
//     */
//    @RequestMapping(value = "/queryPrice")
//    public String queryPrice() {
//        Root root=new Root();
//        QueryPriceBody queryPriceBody =new QueryPriceBody();
//        Head Head =new Head();
//
//        //body
//        queryPriceBody.setTRIMID("164527");
//        queryPriceBody.setTYPE("1");
//        queryPriceBody.setCONDITION("1");
//        queryPriceBody.setMILE("10");
//        queryPriceBody.setCITY("北京");
//        //head
//        Head.setSEQNO(UUIDUtil.getUUID());
//        Head.setSERVICECODE("sendShortMessage");
//        Head.setCHANNELID("YWXT");
//        Head.setSENDTIME("20160630163701");
//        root.setBody(queryPriceBody);
//        root.setHead(Head);
//        Root root1 = sendNoteRpcQz.sendNote(root);
//        System.out.println(root1);
//        return "";
//    }
//    /**
//     *@Description:根据车架号查询车型信息
//     *@Author:QianHuaSheng
//     *@Param:[]
//     *@Date: 2017/11/16 13:23
//     *@Return:java.lang.String
//     */
//    @RequestMapping(value = "/getVehicleTypeByVIN")
//    public String getVehicleTypeByVIN() {
//        Root root=new Root();
//        GetVehicleTypeByVINBody getVehicleTypeByVINBody =new GetVehicleTypeByVINBody();
//        Head Head =new Head();
//
//        //body
//        getVehicleTypeByVINBody.setApplyNo("AA-1123213");
//        getVehicleTypeByVINBody.setOperator("10000001");
//        getVehicleTypeByVINBody.setCurrentNo("车架号");
//        //head
//        Head.setSEQNO(UUIDUtil.getUUID());
//        Head.setSERVICECODE("sendShortMessage");
//        Head.setCHANNELID("YWXT");
//        Head.setSENDTIME("20160630163701");
//        root.setBody(getVehicleTypeByVINBody);
//        root.setHead(Head);
//        Root root1 = sendNoteRpcQz.sendNote(root);
//        System.out.println(root1);
//        return "";
//    }
//    @RequestMapping(value = "/commitQuery")
//    public String commitQuery() {
//        /**
//         *@Description:提交查询
//         *@Author:QianHuaSheng
//         *@Param:[]
//         *@Date: 2017/11/16 13:25
//         *@Return:java.lang.String
//         */
//        Root root=new Root();
//        CommitQueryBody commitQueryBody =new CommitQueryBody();
//        Head Head =new Head();
//        //body
//        commitQueryBody.setOperator("AA-1123213");
//        commitQueryBody.setApplyNo("zhangsan");
//        commitQueryBody.setIsForceQuery("N");
//        CommitQueryBody.person person1=new CommitQueryBody.person();
//        CommitQueryBody.person person2=new CommitQueryBody.person();
//
//        person1.setApplyType("2016081200001");
//        person1.setName("0001");
//        person1.setIdNo("17621067724");
//        person1.setIdType("亲爱的用户您好");
//        person1.setReason("2016081200001");
//        person1.setMobile("0001");
//        person1.setWorkUnit("17621067724");
//        person1.setResidenceAddress("亲爱的用户您好");
//        person1.setWorkUnitAddress("2016081200001");
//        person1.setHomeTel("0001");
//        person1.setWorkUnitPhone("17621067724");
//        person1.setWeixin("亲爱的用户您好");
//
//        person1.setQq("2016081200001");
//        person1.setEmail("0030");
//        person1.setBankCardNo("17621067724");
//
//        person2.setApplyType("2016081200001");
//        person2.setName("0001");
//        person2.setIdNo("17621067724");
//        person2.setIdType("亲爱的用户您好");
//        person2.setReason("2016081200001");
//        person2.setMobile("0001");
//        person2.setWorkUnit("17621067724");
//        person2.setResidenceAddress("亲爱的用户您好");
//        person2.setWorkUnitAddress("2016081200001");
//        person2.setHomeTel("0001");
//        person2.setWorkUnitPhone("17621067724");
//        person2.setWeixin("亲爱的用户您好");
//
//        person2.setQq("2016081200001");
//        person2.setEmail("0030");
//        person2.setBankCardNo("17621067724");
//
//        Set<CommitQueryBody.person> persons = new HashSet<CommitQueryBody.person>();
//        persons.add(person1);
//        persons.add(person2);
//
//        commitQueryBody.setPersons(persons);
//        //guaranteeCompany
//        CommitQueryBody.guaranteeCompany guaranteeCompany=new CommitQueryBody.guaranteeCompany();
//        guaranteeCompany.setCompanyName("企业名称");
//        guaranteeCompany.setBusinessLicenceNo("营业执照编号");
//        guaranteeCompany.setLawPersonName("法人姓名");
//        guaranteeCompany.setLawPersonIdNo("法人身份证号");
//        guaranteeCompany.setWorkUnitPhone("单位电话");
//        guaranteeCompany.setWorkUnitAddress("经营地址");
//        commitQueryBody.setGuaranteeCompany(guaranteeCompany);
//        //head
//        UUID uuid = UUID.randomUUID();
//        Head.setSEQNO(UUIDUtil.getUUID());
//        Head.setSERVICECODE("sendShortMessage");
//        Head.setCHANNELID("YWXT");
//        Head.setSENDTIME("20160630163701");
//        root.setBody(commitQueryBody);
//        root.setHead(Head);
//        Root root1 = sendNoteRpcQz.sendNote(root);
//        System.out.println(root1);
//        return "";
//    }
//
//    /**
//     *@Description:测试json格式目标本地的一个controller
//     *@Author:QianHuaSheng
//     *@Param:[]
//     *@Date: 2017/11/14 15:52
//     *@Return:java.lang.String
//     */
////	@RequestMapping(value = "/createJSONPerson")
////	public String createJSONPerson() {
////		Item item=new Item();
////		item.setName("MER_APPLY_RESULT");
////		item.setValue("Y");
////		Item items = SendNoteRpc.reqCheck(item);
////		System.out.println(items.getName()+items.getValue());
////		//调用接口并返回结果
//////		transData.setTransHead(transData.getTransHead());
//////		System.out.println(transData.getTransHead());
////		return "";
////	}
//
//    /**
//     *@Description:用于将对象转化成xml格式
//     *@Author:QianHuaSheng
//     *@Param:[value]
//     *@Date: 2017/11/14 15:52
//     *@Return:java.lang.String
//     */
//    public  static String objectToXml(Object value) {
//        String str = null;
//        JAXBContext context = null;
//        StringWriter writer = null;
//        try {
//            context = JAXBContext.newInstance(value.getClass());
//            Marshaller mar = context.createMarshaller();
//            writer = new StringWriter();
//            mar.marshal(value, writer);
//            str = writer.toString().replace("getProductRequest", "GetProductRequest");
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }finally {
//            if(context != null) context = null;
//            if(writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                writer = null;
//            }
//        }
//        return str;
//    }
//}
