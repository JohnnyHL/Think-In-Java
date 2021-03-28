package com.hl.magic;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * X.509证书解析测试类
 *
 * an X509Certificate structure.
 * <pre>
 *  Certificate ::= SEQUENCE {
 *      tbsCertificate          TBSCertificate,
 *      signatureAlgorithm      AlgorithmIdentifier,
 *      signature               BIT STRING
 *  }
 * </pre>
 *
 *
 * @author HL
 * @date 2021/3/23 20:13
 */
public class ParseCertTest {

    @Test
    public void test_parseCert(){
        try {
            byte[] certData = Files.readAllBytes(Paths.get("F:\\Tests\\Cert-Test\\1111.cer"));
            Certificate certificate = Certificate.getInstance(certData);

            TBSCertificate tbsCertificate = certificate.getTBSCertificate();
            System.out.println("version：" + tbsCertificate.getVersion());

            AlgorithmIdentifier signatureAlgorithm = certificate.getSignatureAlgorithm();
            ASN1ObjectIdentifier algorithm = signatureAlgorithm.getAlgorithm();
            System.out.println("algorithmId：" + algorithm.getId());

            DERBitString signature = certificate.getSignature();
            System.out.println("signValue：" + signature.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_envelopCert(){

    }
}
