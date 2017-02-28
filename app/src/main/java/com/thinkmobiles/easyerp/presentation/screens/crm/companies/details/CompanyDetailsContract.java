package com.thinkmobiles.easyerp.presentation.screens.crm.companies.details;

import android.os.Bundle;

import com.thinkmobiles.easyerp.data.model.crm.companies.detail.ResponseGetCompanyDetails;
import com.thinkmobiles.easyerp.presentation.base.BaseModel;
import com.thinkmobiles.easyerp.presentation.base.BaseView;
import com.thinkmobiles.easyerp.presentation.base.rules.content.ContentPresenter;
import com.thinkmobiles.easyerp.presentation.base.rules.content.ContentView;
import com.thinkmobiles.easyerp.presentation.holders.data.crm.AttachmentDH;
import com.thinkmobiles.easyerp.presentation.holders.data.crm.ContactDH;
import com.thinkmobiles.easyerp.presentation.holders.data.crm.HistoryDH;
import com.thinkmobiles.easyerp.presentation.holders.data.crm.LeadAndOpportunityDH;
import com.thinkmobiles.easyerp.presentation.listeners.IFragmentInstance;

import java.util.ArrayList;

import rx.Observable;

/**
 * Created by Lynx on 2/2/2017.
 */

public interface CompanyDetailsContract {
    interface CompanyDetailsView extends BaseView<CompanyDetailsPresenter>, ContentView {
        void showHistory(boolean isShow);

        void showBillingAddress(boolean isShown);
        void showShippingAddress(boolean isShown);
        void showSalesAndPurchases(boolean isShown);
        void showContact(boolean isShown);
        void showLeadsAndOpportunities(boolean isShown);
        void showAttachments(boolean isShown);

        void displayCompanyImage(String base64Image);
        void displayCompanyName(String companyName);
        void displayCompanyUrl(String companyUrl);
        void displayEmail(String email);
        void enableFacebookButton(String url);
        void enableLinkedInButton(String url);
        void enableSkypeButton(String url);

        void displayAssignedTo(String assignedTo);
        void displayLinkedIn(String linkedIn);
        void displayFacebook(String facebook);
        void displayPhone(String phone);
        void displayMobile(String mobile);

        void displayBillingStreet(String billingStreet);
        void displayBillingCity(String billingCity);
        void displayBillingState(String billingState);
        void displayBillingZip(String billingZip);
        void displayBillingCountry(String billingCountry);

        void displayShippingFullName(String shippingFullName);
        void displayShippingStreet(String shippingStreet);
        void displayShippingCity(String shippingCity);
        void displayShippingState(String shippingState);
        void displayShippingZip(String shippingZip);
        void displayShippingCountry(String shippingCountry);

        void displaySalesReference(String salesReference);
        void displaySalesIsCustomer(boolean isCustomer);
        void displaySalesIsSupplier(boolean isSupplier);
        void displaySalesTeam(String salesTeam);
        void displaySalesPerson(String salesPerson);
        void displaySalesImplementedBy(String salesImplementedBy);
        void displaySalesLanguage(String salesLanguage);

        void displayContacts(ArrayList<ContactDH> contactDHs);
        void displayLeadAndOpportunity(ArrayList<LeadAndOpportunityDH> leadAndOpportunityDHs);
        void displayAttachments(ArrayList<AttachmentDH> attachmentDHs);
        void displayHistory(ArrayList<HistoryDH> historyDHs);
        void startUrlIntent(String url);

        void openPersonDetails(String id, String title);
        void openOpportunityDetails(String id, String title);
    }
    interface CompanyDetailsPresenter extends ContentPresenter {
        void changeNotesVisibility();
        void startAttachment(int pos);
        void showOpportunityDetails(int pos);
        void showPersonDetails(int pos);
    }
    interface CompanyDetailsModel extends BaseModel {
        Observable<ResponseGetCompanyDetails> getCompanyDetails(String companyID);
    }
}
