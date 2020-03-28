package DesignPatternes1;

public interface Resposta {
	
	void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);

}
