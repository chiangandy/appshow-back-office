<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Insert title here</title>
</head>
<body>

<script class="code" type="text/javascript">
			$(document).ready(function(){

			    var arr = [[11, 123, 1236, "Acura"], [45, 92, 1067, "Alfa Romeo"], 
			    [24, 104, 1176, "AM General"], [50, 23, 610, "Aston Martin Lagonda"], 
			    [18, 17, 539, "Audi"], [7, 89, 864, "BMW"], [2, 13, 1026, "Bugatti"]];
			    

			    // Enable plugins like cursor and highlighter by default.
			    $.jqplot.config.enablePlugins = true;
			    // For these examples, don't show the to image button.
			    $.jqplot._noToImageButton = true;
			 
				  goog = [["6/22/2009",425.32],["6/15/2009",420.09],["6/8/2009",424.84],["6/1/2009",444.32],["5/26/2009",417.23],
				  ["5/18/2009",393.5],["5/11/2009",390],["5/4/2009",407.33],["4/27/2009",393.69],["4/20/2009",389.49],
				  ["4/13/2009",392.24],["4/6/2009",372.5],["3/30/2009",369.78],["3/23/2009",347.7],["3/16/2009",330.16],
				  ["3/9/2009",324.42],["3/2/2009",308.57],["2/23/2009",337.99],["2/17/2009",346.45],["2/9/2009",357.68],
				  ["2/2/2009",371.28],["1/26/2009",338.53],["1/20/2009",324.7],["1/12/2009",299.67],["1/5/2009",315.07],
				  ["12/29/2008",321.32],["12/22/2008",300.36],["12/15/2008",310.17],["12/8/2008",315.76],["12/1/2008",283.99],
				  ["11/24/2008",292.96],["11/17/2008",262.43],["11/10/2008",310.02],["11/3/2008",331.14],["10/27/2008",359.36],
				  ["10/20/2008",339.29],["10/13/2008",372.54],["10/6/2008",332],["9/29/2008",386.91],["9/22/2008",431.04],
				  ["9/15/2008",449.15],["9/8/2008",437.66],["9/2/2008",444.25],["8/25/2008",463.29],["8/18/2008",490.59], 
				  ["8/11/2008",510.15], ["8/4/2008",495.01], ["7/28/2008",467.86],["7/21/2008",491.98], ["7/14/2008",481.32],
				  ["7/7/2008",533.8],["6/30/2008",537], ["6/23/2008",528.07], ["6/16/2008",546.43],["6/9/2008",571.51],["6/2/2008",567],
				  ["5/27/2008",585.8],["5/19/2008",544.62], ["5/12/2008",580.07],["5/5/2008",573.2],["4/28/2008",581.29],
				  ["4/21/2008",544.06],["4/14/2008",539.41],["4/7/2008",457.45], ["3/31/2008",471.09],["3/24/2008",438.08],
				  ["3/17/2008",433.55], ["3/10/2008",437.92], ["3/3/2008",433.35],["2/25/2008",471.18],["2/19/2008",507.8],
				  ["2/11/2008",529.64],["2/4/2008",516.69],["1/28/2008",515.9], ["1/22/2008",566.4],["1/14/2008",600.25],
				  ["1/7/2008",638.25],["12/31/2007",657],["12/24/2007",702.53],["12/17/2007",696.69],["12/10/2007",689.96],
				  ["12/3/2007",714.87], ["11/26/2007",693], ["11/19/2007",676.7],["11/12/2007",633.63],["11/5/2007",663.97],
				  ["10/29/2007",711.25],["10/22/2007",674.6],["10/15/2007",644.71],["10/8/2007",637.39],["10/1/2007",594.05],
				  ["9/24/2007",567.27], ["9/17/2007",560.1], ["9/10/2007",528.75], ["9/4/2007",519.35],["8/27/2007",515.25],
				  ["8/20/2007",515]];




			    var plot1 = $.jqplot('chartdiv1',[arr],{
			        title: '活動落點分析圖',
			        seriesDefaults:{
			            renderer: $.jqplot.BubbleRenderer,
			            rendererOptions: {
			                bubbleGradients: true
			            },
			            shadow: true
			        }
			    });

			    opts = {
			      title: '網路流量數據分析圖',
			      series: [{
			          neighborThreshold: 0
			      }],
			      axes: {
			          xaxis: {
			            renderer:$.jqplot.DateAxisRenderer,
			            min:'August 1, 2007',
			            tickInterval: "6 months",
			            tickOptions:{formatString:"%Y/%#m/%#d"}
			          },
			          yaxis: {
			              // renderer: $.jqplot.LogAxisRenderer,
			              tickOptions:{prefix: '$'}
			          }
			      },
			      cursor:{zoom:true}
			  	};

			  	plot1 = $.jqplot('chartdiv2', [goog], opts);
			});


$(document).ready(function () {
    var s1 = [[2002, 112000], [2003, 122000], [2004, 104000], [2005, 99000], [2006, 121000], 
    [2007, 148000], [2008, 114000], [2009, 133000], [2010, 161000], [2011, 173000]];
    var s2 = [[2002, 10200], [2003, 10800], [2004, 11200], [2005, 11800], [2006, 12400], 
    [2007, 12800], [2008, 13200], [2009, 12600], [2010, 13100]];
 
    plot1 = $.jqplot("chartdiv4", [s2, s1], {
    	title: '月份分析圖',
        // Turns on animatino for all series in this plot.
        animate: true,
        // Will animate plot on calls to plot1.replot({resetAxes:true})
        animateReplot: true,
        cursor: {
            show: true,
            zoom: true,
            looseZoom: true,
            showTooltip: false
        },
        series:[
            {
                pointLabels: {
                    show: true
                },
                renderer: $.jqplot.BarRenderer,
                showHighlight: false,
                yaxis: 'y2axis',
                rendererOptions: {
                    // Speed up the animation a little bit.
                    // This is a number of milliseconds.  
                    // Default for bar series is 3000.  
                    animation: {
                        speed: 2500
                    },
                    barWidth: 15,
                    barPadding: -15,
                    barMargin: 0,
                    highlightMouseOver: false
                }
            }, 
            {
                rendererOptions: {
                    // speed up the animation a little bit.
                    // This is a number of milliseconds.
                    // Default for a line series is 2500.
                    animation: {
                        speed: 2000
                    }
                }
            }
        ],
        axesDefaults: {
            pad: 0
        },
        axes: {
            // These options will set up the x axis like a category axis.
            xaxis: {
                tickInterval: 1,
                drawMajorGridlines: false,
                drawMinorGridlines: true,
                drawMajorTickMarks: false,
                rendererOptions: {
                tickInset: 0.5,
                minorTicks: 1
            }
            },
            yaxis: {
                tickOptions: {
                    formatString: "$%'d"
                },
                rendererOptions: {
                    forceTickAt0: true
                }
            },
            y2axis: {
                tickOptions: {
                    formatString: "$%'d"
                },
                rendererOptions: {
                    // align the ticks on the y2 axis with the y axis.
                    alignTicks: true,
                    forceTickAt0: true
                }
            }
        },
        highlighter: {
            show: true, 
            showLabel: true, 
            tooltipAxes: 'y',
            sizeAdjust: 7.5 , tooltipLocation : 'ne'
        }
    });
   
});

</script>
			
	<div id="container" style="width:100%">
		<div id="header" ><h1>營運狀態分析</h1></div>
		<div id="chart_A" >
			<div id="chartdiv1" style="height:400px;width:25%;float:left;"></div>
			<div id="chartdiv4" style="height:400px;width:75%;float:right;"></div>
		</div>
		<br/>
		<div id="chart_B" >
			<div id="chartdiv2" style="height:300px;width:100%;float:left;"></div>
		</div>
		<div id="footer" style="clear:both;text-align:center;">
		data presentation
		</div>
	</div>
	
</body>
</html>