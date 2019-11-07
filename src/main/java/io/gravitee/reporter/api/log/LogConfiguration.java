package io.gravitee.reporter.api.log;

public class LogConfiguration {
    private boolean logSSLInformation;
    private boolean logCertificateChains;

    public LogConfiguration() {
    }

    public boolean isLogSSLInformation() {
        return logSSLInformation;
    }

    public void setLogSSLInformation(boolean logSSLInformation) {
        this.logSSLInformation = logSSLInformation;
    }

    public boolean isLogCertificateChains() {
        return logCertificateChains;
    }

    public void setLogCertificateChains(boolean logCertificateChains) {
        this.logCertificateChains = logCertificateChains;
    }
}
