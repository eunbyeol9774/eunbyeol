using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// 빈 페이지 항목 템플릿에 대한 설명은 https://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x412에 나와 있습니다.

namespace App3
{
    /// <summary>
    /// 자체적으로 사용하거나 프레임 내에서 탐색할 수 있는 빈 페이지입니다.
    /// </summary>
    public sealed partial class MainPage : Page
    {
        public MainPage()
        {
            this.InitializeComponent();



        }
        void btn1_OnClick(object sender, RoutedEventArgs e)
        {
            btn1.Foreground = new SolidColorBrush(Windows.UI.Colors.Blue);
            btn1_Text.Text = "Click event occurs on Hover.";
            btn2_Text.Text = "";
            btn2_Text.Text = "";
        }

        void btn2_OnClick(object sender, RoutedEventArgs e)
        {
            btn2.Foreground = new SolidColorBrush(Windows.UI.Colors.Green);
            btn1_Text.Text = "";
            btn2_Text.Text = "Click event occurs on Press.";
            btn3_Text.Text = "";
        }

        void btn3_OnClick(object sender, RoutedEventArgs e)
        {
            btn1.Foreground = new SolidColorBrush(Windows.UI.Colors.Green);
            btn2.Foreground = new SolidColorBrush(Windows.UI.Colors.Blue);
            btn1_Text.Text = "";
            btn2_Text.Text = "";
            btn3_Text.Text = "Click event occurs on Release.";
        }
    }
}
