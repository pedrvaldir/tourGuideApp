package com.example.valdir.tourguideapp;

/**
 * Created by VALDIR on 20/12/2017.
 * /**
 * {@link Element} Representa um elemento da lista de categoria que o usuário deseja consultar.
 * Ele contém o Titulo do elemento, o endereço e o telefone.
 */

public class Element {
    /**
     * Titulo do elemento
     */
    private String mTitle;

    /**
     * Endereço do elemento
     */
    private String mAdress;

    /**
     * Contato do elemento
     */
    private String mTelephone;

    /**
     * Horário de funcionamento do elemento
     */
    private String mOperatingHours;

    /**
     * Id do recurso da imagem para o elemento
     */
    private int mImagemResourceId = NO_IMAGE_PROVIDED;

    /**
     * O valor constante que representa nenhuma imagem foi fornecido para o elemento
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Criando um novo Objeto elemento.
     *
     * @param title          é o titulo do elemento
     * @param adress         é o endereço em que se encontra o elemento
     * @param telephone      é o telefone para contato com o elemento
     * @param operatingHours é o horario de funcionamento do elemento
     */
    public Element(String title, String adress, String telephone, String operatingHours) {
        mTitle = title;
        mAdress = adress;
        mTelephone = telephone;
        mOperatingHours = operatingHours;
    }

    /**
     * Criando um novo Objeto elemento.
     *
     * @param title           é o titulo do elemento
     * @param adress          é o endereço em que se encontra o elemento
     * @param telephone       é o telefone para contato com o elemento
     * @param operatingHours  é o horario de funcionamento do elemento
     * @param imageResourceId é a ID do recurso desenhável para a imagem associada à palavra
     */
    public Element(String title, String adress, String telephone, String operatingHours, int imageResourceId) {
        mTitle = title;
        mAdress = adress;
        mTelephone = telephone;
        mOperatingHours = operatingHours;
        mImagemResourceId = imageResourceId;
    }

    /**
     * Obtenha o titulo do elemento
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Obtenha o endereço do elemento
     */
    public String getAdress() {
        return mAdress;
    }

    /**
     * Obtenha o telefone do elemento
     */
    public String getTelephone() {
        return mTelephone;
    }

    /**
     * Obtenha o horario de funcionamento do elemento
     */
    public String getOperatingHours() {
        return mOperatingHours;
    }

    /**
     * Obtenha o id do recurdo de imagem do elemento
     */
    public int getmImagemResourceId() {
        return mImagemResourceId;
    }

    /**
     * Retorna se há ou não uma imagem para o elemento.
     */
    public boolean hasImage() {
        return mImagemResourceId != NO_IMAGE_PROVIDED;
    }
}
