package org.example;

import com.prowidesoftware.swift.model.mx.MxPacs00800109;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Byeee world!");

        MxPacs00800109 mxPacs00800109 = new MxPacs00800109("<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.09\">\n" +
                "    <AppHdr>\n" +
                "        <Fr>\n" +
                "            <FIId>\n" +
                "                <FinInstnId>\n" +
                "                    <BIC>citius33</BIC>\n" +
                "                </FinInstnId>\n" +
                "            </FIId>\n" +
                "        </Fr>\n" +
                "        <To>\n" +
                "            <FIId>\n" +
                "                <FinInstnId>\n" +
                "                    <BIC>lloydgb</BIC>\n" +
                "                </FinInstnId>\n" +
                "            </FIId>\n" +
                "        </To>\n" +
                "        <BizMsgIdr>YOUR_BUSINESS_MESSAGE_ID</BizMsgIdr>\n" +
                "        <MsgDefIdr>pacs.008.001.09</MsgDefIdr>\n" +
                "        <CreDt>2023-06-12T12:00:00Z</CreDt>\n" +
                "    </AppHdr>\n" +
                "    <FIToFICstmrCdtTrf>\n" +
                "        <GrpHdr>\n" +
                "            <MsgId>YOUR_MESSAGE_ID</MsgId>\n" +
                "            <CreDtTm>2023-06-12T12:00:00Z</CreDtTm>\n" +
                "            <NbOfTxs>1</NbOfTxs>\n" +
                "            <CtrlSum>100.00</CtrlSum>\n" +
                "            <InitgPty>\n" +
                "                <Nm>Sender Name</Nm>\n" +
                "            </InitgPty>\n" +
                "        </GrpHdr>\n" +
                "        <CdtTrfTxInf>\n" +
                "            <PmtId>\n" +
                "                <EndToEndId>YOUR_END_TO_END_ID</EndToEndId>\n" +
                "            </PmtId>\n" +
                "            <Amt>\n" +
                "                <InstdAmt Ccy=\"EUR\">100.00</InstdAmt>\n" +
                "            </Amt>\n" +
                "            <Cdtr>\n" +
                "                <Nm>Receiver Name</Nm>\n" +
                "            </Cdtr>\n" +
                "            <CdtrAcct>\n" +
                "                <Id>\n" +
                "                    <IBAN>GB12345678901234567890</IBAN>\n" +
                "                </Id>\n" +
                "            </CdtrAcct>\n" +
                "            <CdtrAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BIC>lloydgb</BIC>\n" +
                "                </FinInstnId>\n" +
                "            </CdtrAgt>\n" +
                "            <ChrgBr>SLEV</ChrgBr>\n" +
                "            <UltmtCdtr>\n" +
                "                <Nm>Ultimate Receiver Name</Nm>\n" +
                "            </UltmtCdtr>\n" +
                "        </CdtTrfTxInf>\n" +
                "    </FIToFICstmrCdtTrf>\n" +
                "</Document>");
        String s = mxPacs00800109.message().toString();
        System.out.println(s);



    }
}