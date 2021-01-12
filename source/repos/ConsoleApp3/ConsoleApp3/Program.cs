<Page
    x:Class="HelloWorld.MainPage"
    xmlns="http://schemas.microsoft.com/winfx/2006/xaml/presentation"
    xmlns:x="http://schemas.microsoft.com/winfx/2006/xaml"
    xmlns:local="using:HelloWorld"
    xmlns:d="http://schemas.microsoft.com/expression/blend/2008"
    xmlns:mc="http://schemas.openxmlformats.org/markup-compatibility/2006"
    mc:Ignorable="d"
    Background="{ThemeResource ApplicationPageBackgroundThemeBrush}">

    <Grid>
        <StackPanel x:Name="LayoutRoot" Margin="10">

            <Button x:Name="btn1" Content="Hover to Click"
                Click="OnClick1" ClickMode="Hover"
                Margin="5" Width="150"
                HorizontalAlignment="Left"
                Foreground="Green"/>  
            
            <TextBlock x:Name="text1" Margin="5,8,0,0" />

            <Button x:Name="btn2" Content="Press to Click"
                Click="OnClick2" ClickMode="Press"
                Margin="5,5,5,5" Width="150" 
                HorizontalAlignment="Left" 
                Foreground="Blue"/>
            <TextBlock x:Name="text2" Margin="5,8,0,0" />

            <Button x:Name="btn3" Content="Reset"
                Click="OnClick3" ClickMode="Release"
                Margin="5,5,5,5" Width="150"
                HorizontalAlignment="Left"/>
            <TextBlock x:Name="text3" Margin="5,8,0,0" />
        </StackPanel>
    </Grid>
</Page>
