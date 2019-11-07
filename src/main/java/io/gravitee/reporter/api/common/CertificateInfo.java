package io.gravitee.reporter.api.common;

import java.math.BigInteger;
import java.security.cert.X509Certificate;
import java.util.Objects;

public class CertificateInfo {
    private Integer version;
    private BigInteger serialNumber;
    private String algorithm;
    private String issuer;
    private String subject;

    public CertificateInfo() {
    }

    public CertificateInfo(java.security.cert.Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            this.version = x509Certificate.getVersion();
            this.serialNumber = x509Certificate.getSerialNumber();
            this.algorithm = x509Certificate.getSigAlgName();
            this.issuer = x509Certificate.getIssuerDN().getName();
            this.subject = x509Certificate.getSubjectDN().getName();
        }
        // TODO: other cert types

    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(BigInteger serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CertificateInfo that = (CertificateInfo) o;
        return Objects.equals(version, that.version) &&
                Objects.equals(serialNumber, that.serialNumber) &&
                Objects.equals(algorithm, that.algorithm) &&
                Objects.equals(issuer, that.issuer) &&
                Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, serialNumber, algorithm, issuer, subject);
    }
}
