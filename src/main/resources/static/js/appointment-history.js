$(document).ready(function () {

    $('.search-form').on('submit', function (e) {

        e.preventDefault();

        const searchValue = $('.search-wrapper input').val().trim();

        if (searchValue.length > 0) {
            console.log('Buscar:', searchValue);

            // FUTURO:
            // window.location.href = '/history?search=' + encodeURIComponent(searchValue);
        }

    });



    $('.filter-button').on('click', function () {

        const searchValue = $('.search-wrapper input').val().trim();

        if (searchValue.length > 0) {
            console.log('Filtrar:', searchValue);

            // FUTURO:
            // window.location.href = '/history?search=' + encodeURIComponent(searchValue);
        }

    });


    $('.detail-button').on('click', function () {

        console.log('Ver detalle');


    });


    $('.pagination .page-link').on('click', function (e) {

        e.preventDefault();

        $('.pagination .page-item').removeClass('active');

        $(this).parent().addClass('active');

        console.log('Página:', $(this).text());

    });

});