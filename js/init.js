(function($){
  $(function(){

    $('.button-collapse').sideNav();
    $('.parallax').parallax();

  }); // end of document ready
})(jQuery); // end of jQuery name space

 $(document).ready(function(){
    $(".button-collapse").sideNav();
     
    $('ul.tabs').tabs('select_tab', 'tab_id');
    $('.slider').slider({full_width: true});
 
  });
// Initialize collapse button
  
  // Initialize collapsible (uncomment the line below if you use the dropdown variation)
  //$('.collapsible').collapsible();
//efecto scroll
var options = [ 
    {selector: '#image-test', offset: 500, callback: 'Materialize.fadeInImage("#image-test")' },
{selector: '#image-test2', offset: 500, callback: 'Materialize.fadeInImage("#image-test2")'},
{selector: '#image-test3', offset: 500, callback: 'Materialize.fadeInImage("#image-test3")' }]; 
Materialize.scrollFire(options); 