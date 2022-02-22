function loadBank(){
    $.ajax({
        url:'/api/bank',
        type:'GET',
        dataType:'json',
        success:function (data) {
            console.log(data);
            var optionHtml = "<option value='-1'>Please select a Bank</option>";
            $.each(data, function (index, obj) {
                optionHtml += "<option value='"+obj.bank_id+"'>"+obj.bank_name+"</option>";
            });
            $("#bank").empty().append(optionHtml);
        }
    })
}

function loadCurrency(){
    $.ajax({
        url:'/api/currency',
        type:'GET',
        dataType:'json',
        success:function (data) {
            console.log(data);
            var optionHtml = "";
            $.each(data, function (index, obj) {
                optionHtml += "<option value='"+obj.currency_id+"'>"+obj.currency_type+"</option>";
            });
            $("#currency").empty().append(optionHtml);
        }
    })
}

function loadPurpose(){
    $.ajax({
        url:'/api/purpose',
        type:'GET',
        dataType:'json',
        success:function (data) {
            console.log(data);
            var optionHtml = "<option value='-1'>Select purpose of transfer</option>";
            $.each(data, function (index, obj) {
                optionHtml += "<option value='"+obj.purpose_of_transfer_id+"'>"+obj.purpose_of_transfer_type+"</option>";
            });
            $("#purpose").empty().append(optionHtml);
        }
    })
}

function loadPayeeType(){
    $.ajax({
        url:'/api/type/payee',
        type:'GET',
        dataType:'json',
        success:function (data) {
            console.log(data);
            var optionHtml = "<option value='-1'>Please select a payee type</option>";
            $.each(data, function (index, obj) {
                optionHtml += "<option value='"+obj.type_id+"'>"+obj.type_message+"</option>";
            });
            $("#payeeType").empty().append(optionHtml);
        }
    })
}