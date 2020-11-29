/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.6
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.betterbanking.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@Schema(description = "Unambiguous identification of the account to which credit and debit entries are made.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBAccount4 {
    @SerializedName("AccountId")
    private String accountId = null;

    @SerializedName("Status")
    private OBAccountStatus1Code status = null;

    @SerializedName("StatusUpdateDateTime")
    private OffsetDateTime statusUpdateDateTime = null;

    @SerializedName("Currency")
    private String currency = null;

    @SerializedName("AccountType")
    private OBExternalAccountType1Code accountType = null;

    @SerializedName("AccountSubType")
    private OBExternalAccountSubType1Code accountSubType = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("Nickname")
    private String nickname = null;

    @SerializedName("Account")
    private List<OBAccount4Account> account = null;

    @SerializedName("Servicer")
    private OBBranchAndFinancialInstitutionIdentification50 servicer = null;

    public OBAccount4 accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @Schema(required = true, description = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBAccount4 status(OBAccountStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")
    public OBAccountStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBAccountStatus1Code status) {
        this.status = status;
    }

    public OBAccount4 statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Get statusUpdateDateTime
     *
     * @return statusUpdateDateTime
     **/
    @Schema(description = "")
    public OffsetDateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBAccount4 currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @Schema(required = true, description = "")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OBAccount4 accountType(OBExternalAccountType1Code accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     *
     * @return accountType
     **/
    @Schema(required = true, description = "")
    public OBExternalAccountType1Code getAccountType() {
        return accountType;
    }

    public void setAccountType(OBExternalAccountType1Code accountType) {
        this.accountType = accountType;
    }

    public OBAccount4 accountSubType(OBExternalAccountSubType1Code accountSubType) {
        this.accountSubType = accountSubType;
        return this;
    }

    /**
     * Get accountSubType
     *
     * @return accountSubType
     **/
    @Schema(required = true, description = "")
    public OBExternalAccountSubType1Code getAccountSubType() {
        return accountSubType;
    }

    public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
        this.accountSubType = accountSubType;
    }

    public OBAccount4 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBAccount4 nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * Get nickname
     *
     * @return nickname
     **/
    @Schema(description = "")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public OBAccount4 account(List<OBAccount4Account> account) {
        this.account = account;
        return this;
    }

    public OBAccount4 addAccountItem(OBAccount4Account accountItem) {
        if (this.account == null) {
            this.account = new ArrayList<OBAccount4Account>();
        }
        this.account.add(accountItem);
        return this;
    }

    /**
     * Get account
     *
     * @return account
     **/
    @Schema(description = "")
    public List<OBAccount4Account> getAccount() {
        return account;
    }

    public void setAccount(List<OBAccount4Account> account) {
        this.account = account;
    }

    public OBAccount4 servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
        this.servicer = servicer;
        return this;
    }

    /**
     * Get servicer
     *
     * @return servicer
     **/
    @Schema(description = "")
    public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
        return servicer;
    }

    public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
        this.servicer = servicer;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBAccount4 obAccount4 = (OBAccount4) o;
        return Objects.equals(this.accountId, obAccount4.accountId) &&
                Objects.equals(this.status, obAccount4.status) &&
                Objects.equals(this.statusUpdateDateTime, obAccount4.statusUpdateDateTime) &&
                Objects.equals(this.currency, obAccount4.currency) &&
                Objects.equals(this.accountType, obAccount4.accountType) &&
                Objects.equals(this.accountSubType, obAccount4.accountSubType) &&
                Objects.equals(this.description, obAccount4.description) &&
                Objects.equals(this.nickname, obAccount4.nickname) &&
                Objects.equals(this.account, obAccount4.account) &&
                Objects.equals(this.servicer, obAccount4.servicer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, account, servicer);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBAccount4 {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
