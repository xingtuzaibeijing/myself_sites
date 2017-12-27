//package org.qhs.myselfSites.dome.feign;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class FooConfiguration {
//
//   // private JAXBContextFactor jaxbFactory = new JAXBContextFactory.Builder().build();
//
//    //    @Bean
////    public Contract feignContract() {
////        return new feign.Contract.Default();
////    }
////    @Bean
////    public Feign.Builder feignEncoder(){
////        JAXBContextFactory jaxbFactory = new JAXBContextFactory.Builder().build();
////        return Feign.builder().encoder(new JAXBEncoder(jaxbFactory));
////    }
////    @Bean
////    Logger.Level feignLoggerLevel() {
////        return Logger.Level.FULL;
////    }
//    @Bean
//    public Decoder feignDecoder() {
//        jaxbFactory = new JAXBContextFactory.Builder().build();
//        return new JAXBDecoder(jaxbFactory);
//    }
//
//    @Bean
//    public Encoder feignEncoder() {
//        jaxbFactory = new JAXBContextFactory.Builder().build();
//        return new JAXBEncoder(jaxbFactory);
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Feign.Builder feignBuilder(Retryer retryer) {
//        return  Feign.builder().retryer(retryer);
////                .encoder(new JAXBEncoder(jaxbFactory))//编码器
//////				.decoder(new GsonDecoder())
//////				.encoder(new GsonEncoder())
////                .decoder(new JAXBDecoder(jaxbFactory));
//    }jaxbFactory
//}
