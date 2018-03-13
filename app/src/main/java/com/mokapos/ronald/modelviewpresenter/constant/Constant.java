package com.mokapos.ronald.modelviewpresenter.constant;

import java.util.HashMap;

public class Constant {
    public static enum Discount {
        CASH, PERCENTAGE
    }

    public static final String SEND_GRID_API = "https://api.sendgrid.com/v3/";
    public static final String SEND_GRID_TO = "moka-developers@googlegroups.com";
    public static final String SEND_GRID_FROM = "no-reply@mokapos.com";


    //    public static final String EXIST_ITEM_CATEGORY_DISCOUNT = "exist_item_category_discount";
    public static final String UNCATEGORIZED = "Uncategorized";
    public static final String WITH_UPDATED = "with_updated";
    public static final String UPDATE = "UPDATE ";
    public static final String SELECT = "SELECT ";
    public static final String WHERE = " WHERE ";
    public static final String NOT_IN = " NOT IN ";
    public static final String NO_SALES_TYPE = "No Sales Type";

    public static final String EMPTY = "";
    public static final String AND = " AND ";
    public static final String OR = " OR ";
    public static final String SET = " SET ";
    public static final String SC = "SC";
    public static final String SINCE = "since";
    public static final String UNTIL = "until";
    public static final String ICMP = "iCMP";

    public static final String LIKE = " LIKE ?";
    public static final String COLLATE = " COLLATE NOCASE ASC ";
    public static final String DESC = " DESC ";
    public static final String OUTLET_ID = "outletId";


    public static final String LIMIT = " LIMIT 0, ";
    public static final String LIMIT_PAGE = "limit";
    public static final String LIMIT_QUERY_STRING = "limit";
    public static final String DEEP = "deep";

    public static final String NEW_ORDER = "NEW ORDER";
    public static final String ADDITIONAL_ORDER = "ADDITIONAL ORDER";
    public static final String CANCEL_ORDER = "CANCEL ORDER";

    public static final String PER_PAGE = "per_page";
    public static final String TIME = "time";
    public static final int FAILED_TO_DOWNLOAD = -2;
    public static final String VALID = "valid";
    public static final String SEARCH = "search";
    public static final String BARCODE_VARIABLE_ITEM = "barcode_variable_item";
    public static final String BUSINESS_TYPE_ID = "business_type_id";
    public static final String PAGE = "page";
    public static final String PRINT_TASK_BUNDLE = "print_task_bundle";
    public static final String IS_TAX_CHANGE = "is_tax_change";
    public static final String IS_GRATUITY_CHANGE = "is_gratuity_change";
    public static final String UPDATED_AT = "updated_at";
    public static final String IS_NEW = "is_new";
    public static final String IS_INVOICE = "is_invoice";
    public static final String INVOICE = "invoice";
    public static final String INVOICE_NO = "invoice_no";
    public static final String INVENTORY = "Inventory";

    public static final String NEED_SYNC = "sync";
    //susilo -identifier
    public static final int DEVICE_SETTING_ID = 23101992;
    //susilo
    public static final int CHECKOUT_PRINT = 0;
    public static final int REPORT_PRINT = 1;
    public static final int BILL_PRINT = 2;
    public static final int ORDER_TICKET_PRINT = 3;
    public static final String MESSAGE = "message";
    public static final String NOTE = "note";
    public static final String PRINTER_TYPE = "printer_type";

    public static final String BROADCAST_PRINTER_FINISH = "broadcast_printer_finish";
    public static final String BROADCAST_ACTIVITY_FINISH = "broadcast_printer_finish";
    public static final String TITLE = "title";
    public static final String NUM_PRINTER = "num_printer";
    public static final String NUM_RESPON = "num_respon";
    public static final String REGEX_NUMBER = "-?\\d+";

    public static final String DONE_EDITING = "done_editing";
    public static final String REACHABLE = "reachable";
    public static final String IS_DIALOG = "is_dialog";
    public static final String F_FAVORITE = "f_favorite";

    public static final String BROADCAST_BACK_TO_CATEGORY = "back_to_category";
    public static final String FORMAT_DATE = "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ";
    public static final String DATE = "date";
    public static final String BROADCAST_CHARGE_TOTAL = "price_charge_total";
    public static final String BROADCAST_CLEAR_FOOTER_VIEW = "clear_footer_view";
    public static final String BROADCAST_MPOP_STATUS = "mpop_status";
    public static final String BROADCAST_RESET_PAGE = "broadcast_reset_page";


    public static final String BROADCAST_FAVORITE_CHANGE = "broadcast_favorite_change";
    public static final String CHANGE_NUM_PAGE = "change_num_page";
    public static final int ADD_PAGE = 1;
    public static final int VALIDATE_PAGE = 2;


    public static final String URI = "uri";
    public static final String BROADCAST_CHECK_PAGE_COUNT = "broadcast_check_page_count";
    public static final String BROADCAST_ITEM_HAS_FAVOURITE_CHANGE = "broadcast_has_favourite_change";
    public static final String TOTAL_PRICE = "total_price"; // price before gratuity and tax
    public static final String FINAL_PRICE = "final_price"; // price before gratuity and tax
    public static final String TOTAL_COLLECTED = "total_collected"; // price before gratuity and tax
    public static final String TOTAL_GRATUITY_IN_PERCENT = "total_gratuity";
    public static final String TOTAL_TAX_IN_PERCENT = "total_tax";
    public static final String ID = "id";
    public static final String QUANTITY = "quantity";
    public static final String POSITION_X = "position_X";
    public static final String POS = "pos";
    public static final String CUSTOMER_GUID = "customer_guid";

    public static final String POSITION_Y = "position_Y";
    public static final String KEY_TYPE = "type";
    public static final String SAVE_FAVORITE = "save_favorite";
    public static final String VARIABLE = "variable";
    public static final String VARIABLE_AND_MODIFIER = "variable_and_modifier";
    public static final String CUSTOM_AMOUNT = "custom_amount";
    public static final String CATEGORY_GUID = "category_guid";
    public static final String FAVOURITE_PAGE = "favourite_page";
    public static final String CATEGORY_NAME = "category_name";
    public static final String IS_EDIT_MODE = "is_edit_mode";
    public static final String IS_SMARTPHONE = "is_smartphone";
    public static final String SMS = "sms";


    public static final String ITEM_ID = "item_id";
    public static final String ITEM_GUID = "item_guid";
    public static final String ITEM_NAME = "item_name";
    public static final String ITEM_IMAGE = "item_image";
    public static final String ITEM_VARIANT_GUID = "item_variant_guid";
    public static final String DISCOUNT_ID = "discount_id";
    public static final String LOCALE_ID = "in_ID";
    public static final String IS_EDIT_CUSTOMER = "is_edit_customer";
    public static final String CUSTOMER_ID = "customer_id";
    public static final String CUSTOMER_ROW_ID = "customer_row_id";

    public static final String CUSTOMER_NAME = "customer_name";
    public static final String _SPLITTER = " MoKa ";
    public static final String CHECKOUT_ID = "checkout_id";
    public static final String PAYMENT_TYPE = "payment_type";
    public static final String IS_CHECKOUT = "is_checkout";
    public static final String CREATED_AT = "created_at";
    public static final String ROW_ID = "row_id";
    public static final String MAX_QUANTITY = "max_quantity";
    public static final String REPORT_ID = "report_id";
    public static final String PAYMENT_ID = "payment_id";
    public static final String IS_INVOICE_SUCCEED = "is_invoice_succeed";
    public static final String MAC_ADDRESS = "mac_address";
    public static final String RECEIPT = "receipt";
    public static final String RECEIPT_NUMBER = "receipt_number";
    public static final String RECEIPT_ID = "receipt_id";
    public static final String SETTINGS_UPDATE = "settings_update";
    public static final String MPOS_READER_STATE = "mpos_reader";
    public static final String ITEM_END_ROW = "item_end_row";
    public static final String RP = "Rp. ";
    public static final String RP_ENCLOSURE = " (Rp)";

    public static final String TABLE_NUMBER = "table_number";

    public static final String CHANGER_TABLET = "changer_tablet";
    public static final String DIVIDER = "divider";
    public static final String STATE_DOWNLOADING = "state_downloading";
    public static final String STATE_HTTP = "state_http";
    public static final String HTTP_MESSAGE = "message_http";
    public static final int UNAUTHORIZED = 401;
    public static final int UNPROCESSABLE_ENTITY = 422;

    public static final String SETTING_CHANGES = "setting_changes";

    public static final int ITEM_DOWNLOADED = 1;
    public static final int SETTING_DOWNLOADED = 2;
    public static final int TAX_DOWNLOADED = 3;
    public static final int GRATUITIES_DOWNLOADED = 4;
    public static final int MODIFIERS_DOWNLOADED = 5;
    public static final String MODIFIER = "modifier";
    public static final String VARIANT = "variant";
    public static final String BUNDLE = "bundle";
    public static final String ITEM = "item";

    public static final int FINISH_INSERTING_ITEM = 6;
    public static final int FINISH_INSERTING_VARIANT = 7;
    public static final int FINISH_INSERTING_MODIFIER = 8;
    public static final int FINISH_CONTINUE_SHIFT = 9;
    public static final int CUSTOMERS_DOWNLOADED = 10;
    public static final int CATEGORY_DOWNLOADED = 11;
    public static final int DISCOUNT_DOWNLOADED = 12;
    public static final int FAVORITE_DOWNLOADED = 13;
    public static final int ACTIVITY_DOWNLOADED = 14;
    public static final int ING_INV_DOWNLOADED = 15;
    public static final int MEMBER_DOWNLOADED = 16;
    public static final int PROGRAM_DOWNLOADED = 17;
    public static final int PERMISSION_DOWNLOADED = 18;
    public static final int EMPLOYEE_DOWNLOADED = 19;
    public static final int SALES_TYPE_DOWNLOADED = 20;
    public static final int OPEN_BILL_DOWNLOADED = 21;

    public static final int OPENBILL_SIZE = 10;
    public static final String SC_POSITION = "sc_position";

    public static boolean HAS_CONTINUE_SHIFT = false;

    public static int ITEM_NUM_ACTIVITY = 20;

    public static int DISCOUNT_ALL_ITEMS = 999999;
    public static final String VISA_CARD = "visa";
    public static final String MASTER_CARD = "master";


    public static final String REFRESH = "refresh";

    public static enum DiscountType {
        cash, percentage
    }

    public static enum SettingType {
        TAX, GRATUITY, CHECKOUT, HARDWARE, ACCOUNT
    }

    // mPOS
    public static final String TRANSACTION_RESPONSE_CODE = "transaction_response_code";
    public static final String TYPE = "type";
    public static final String TRANSACTION_TIME = "transaction_time";
    public static final String TRANSACTION_MESSAGE = "transaction_message";
    public static final String IMAGE = "image";
    public static final String CC_NAME = "cc_name";
    public static final String CC_NUMBER = "cc_number";
    public static final String AMOUNT = "amount";
    public static final String CURRENCY = "currency";
    public static final String TIP = "tip";
    public static final String INITIAL_AMOUNT = "initial_amount";
    public static final String CARD_TYPE = "card_type";
    public static final String AUTH_CODE = "auth_code";
    public static final String ORDER_INFO = "order_info";
    public static final String TRANSACTION_NUMBER = "transaction_number";
    public static final String TRANSACTION_REF = "transaction_ref";
    public static final String HISTORY_ID = "history_id";

    public static final String TSI = "TSI";
    public static final String tsi = "tsi";
    public static final String TVR = "TVR";
    public static final String TC = "TC";
    public static final String CVM_RESUlT = "CVMResult";

    public static final String APPLICATION_LABEL = "application_label";
    public static final String AID = "AID";
    public static final String STATUS = "status";
    public static final String REQUIRE_SIGNATURE = "requireSignature";

    public static final String REF1_LABEL = "ref1_label";
    public static final String REF2_LABEL = "ref2_label";
    public static final String REF3_LABEL = "ref3_label";
    public static final String REF4_LABEL = "ref4_label";
    public static final String REF1_VALUE = "ref1_value";
    public static final String REF2_VALUE = "ref2_value";
    public static final String REF3_VALUE = "ref3_value";
    public static final String REF4_VALUE = "ref4_value";
    public static final String MERCHANT_ID = "merchant_id";
    public static final String TERMINAL_ID = "terminal_id";
    public static final String EXCHANGE_RATE = "exchange_rate";
    public static final String FOREIGN_CURRENCY = "foreign_currency";
    public static final String DATE1_FORMAT = "d MMMM yyyy";
    public static final String DATE2_FORMAT = "dd MMM yyyy";
    public static final String DATE3_FORMAT = "dd/MM/yy";
    public static final String DATE4_FORMAT = "yyyy-MM-dd";
    public static final String DATE5_FORMAT = "EEEE, dd MMMM yyyy 'at' HH:mm";
    public static final String DATE6_FORMAT = "dd MMMM yyyy 'at' HH:mm";

    public static final String TIME1_FORMAT = "HH:mm:ss";
    public static final String TIME2_FORMAT = " HH:mm";
    public static final String MINUS_WITH_SPACE = " - ";
    public static final String SPACE = " ";
    public static final String FROM_RECEIPT = "from_receipt";

    public static final String LINE_FEED = "\r\n";

    public static final String CONVERTED_AMOUNT = "converted_amount";
    public static final String CONVERTED_INITIAL_AMOUNT = "converted_initial_amount";
    public static final String CONVERTED_TIP = "converted_tip";
    public static final String PII = "pii";
    public static final String CUSTOMER_EMAIL = "customer_email";

    public static final String CUSTOMER_PHONE = "customer_phone";
    public static final String MOBILE = "mobile";
    public static final String REQUIRE_PAY_SIGNATURE = "require_pay_signature";
    public static final String MERCHANT_NAME = "merchant_name";
    public static final String PAGING_SIZE = "500";
    public static final int DELAY = 5000;
    public static final int RETRY = 3;
    public static final long currentTimeMilis = 752086800000L;
    public static final String SETTING_TYPE = "setting_type";
    public static final String IS_TAX = "is_tax";
    public static final String IS_ON = "is_on";
    public static final String ID_PHONE = "+62";

    public static final String IS_RESEND = "is_resend";
    public static final int TAX = 0;
    public static final int GRATUITY = 1;
    public static final int ALL = 2;

    public static final String NAME = "name";
    public static final String EXIST_EMAIL = "exist_email";

    public static final String EXIST_PHONE = "exist_phone";
    public static final String EMAIL = "email";
    public static final String PHONE = "phone";
    public static final String PASSWORD = "password";
    public static final String PASSWORD_CONFIRMATION = "password_confirmation";
    public static final String STATE = "state";
    public static final String ZIP = "zip";
    public static final String ADDRESS = "address";
    public static final String BIRTHDAY = "birthday";
    public static final String IS_ADD = "is_add";
    public static final int FAVOURITE_PER_PAGE = 20;
    public static final int PAGING = 20;
    public static final int DB_IS_CHANGING = 1;
    public static final String CUSTOM_AMOUNT_TABLET = "custom_amount_tablet";
    public static final String OS_VERSION = "os_version";

    public static final String BROADCAST_OUTER_MENU_CLICKED = "broadcast_outer_menu_clicked";
    public static final String OUTER_MENU_CLICKED_CODE = "outer_menu_clicked_code";

    public static final String OUTLETNOTES = "OUTLETNOTES";
    public static final String CITY = "CITY";
    public static final String PROVINCE = "PROVINCE";
    public static final String FACEBOOK = "FACEBOOK";
    public static final String TWITTER = "TWITTER";
    public static final String WEBSITE = "WEBSITE";
    public static final String INSTAGRAM = "INSTAGRAM";
    public static HashMap<Long, Long> hashMapCustomAmountPrice;
    public static final String RESTART_LOADER = "restart_loader";
    public static final String RESET_CHECKOUT = "reset_checkout";
    public static final String CONNECT_BARCODE = "connect_barcode";
    public static final String BUILD_ALL_ACT = "BUILD_ALL_ACT";
    public static final String IS_FROM_ANOTHER_ACTIVITY = "is_from_another_activity";

    public static final String REGISTER_FINISH_LOADING = "REGISTER_FINISH_LOADING";
    public static final String ACTIVITY_FINISH_LOADING = "ACTIVITY_FINISH_LOADING";
    public static final String SETTING_FINISH_LOADING = "SETTING_FINISH_LOADING";
    public static final String FINISH_RELOAD_ACT = "FINISH_RELOAD_ACT";
    public static final String ACTIVE_OUTLET_ID = "active_outlet_id";
    public static final String IS_FROM_LIB = "is_from_lib";
    public static final String BROADCAST_FINISH_GET = "broadcast_finish";
    public static final String UNABLE_TO_RESOLVE = "java.net.UnknownHostException: Unable to resolve host";
    public static final String BARCODE_CONNECTED = "BARCODE_CONNECTEDt";
    public static final String FIRST_TIME = "first_time";
    public static final int EMAIL_RECEIPT = 1;
    public static final int EMAIL_INVOICE = 2;
    public static final String ERR_MSG = "err_msg";
    public static final String ERR_AT_LEAST_SAVE_ONE_VARIANT = "Please at least save on variant";
    public static final String ERR_VARIANT_NAME_CANNOT_BE_EMPTY = "Item variant name cannot be empty";
    public static final String ERR_ITEM_NAME_CANNOT_BE_BLANK = "Item name cannot be blank";
    public static final String ERR_SKU_HAS_TO_BE_UNIQUE = "Item variant SKU has to be unqiue";
    public static final String ERR_SKU_ALREADY_EXISTS = "SKU already exists for another item. Please use a different SKU.";
    public static final String ERR_THE_NAME_IS_RESERVED = "The name 'Custom Amount' is reserved by Moka systems";
    public static final String ERR_CATEGORY_IS_RESERVED = "The name 'Uncategorized' is reserved by Moka systems";


}
