package org.sword.module;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.DownloadManager;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.DropBoxManager;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;

import org.sword.annotation.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SystemServiceModule {

    @Singleton
    @Provides
    ConnectivityManager provideConnectivtyManager(@ApplicationContext Context context) {
        return (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }


    @Singleton
    @Provides
    AccountManager provideAccountManager(@ApplicationContext Context context) {
        return (AccountManager) context.getSystemService(Context.ACCOUNT_SERVICE);
    }

    @Singleton
    @Provides
    AccessibilityManager provideAccessibilityService(@ApplicationContext Context context) {
        return (AccessibilityManager) context.getSystemService(Context.ACCESSIBILITY_SERVICE);
    }

    @Singleton
    @Provides
    SensorManager provideSensorManager(@ApplicationContext Context context) {
        return (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
    }

    AlarmManager provideAlarmManager(@ApplicationContext Context context) {
        return (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
    }

    @Singleton
    @Provides
    AudioManager provideAudioManager(@ApplicationContext Context context) {
        return (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
    }


    @Singleton
    @Provides
    ActivityManager provideActivitytManager(@ApplicationContext Context context) {
        return (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
    }

    @Singleton
    @Provides
    BatteryManager provideBatteryManager(@ApplicationContext Context context) {
        return (BatteryManager) context.getSystemService(Context.BATTERY_SERVICE);
    }

    @Singleton
    @Provides
    BluetoothManager provideBluetoothManager(@ApplicationContext Context context) {
        return (BluetoothManager) context.getSystemService(Context.BLUETOOTH_SERVICE);
    }

    @Singleton
    @Provides
    CameraManager provideCameraManager(@ApplicationContext Context context) {
        return (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
    }

    @Singleton
    @Provides
    ClipboardManager provideClipboardManager(@ApplicationContext Context context) {
        return (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
    }

    @Singleton
    @Provides
    CaptioningManager provideCaptionManager(@ApplicationContext Context context) {
        return (CaptioningManager) context.getSystemService(Context.CAPTIONING_SERVICE);
    }


    @Singleton
    @Provides
    DisplayManager provideDisplayManager(@ApplicationContext Context context) {
        return (DisplayManager) context.getSystemService(Context.DISPLAY_SERVICE);
    }

    @Singleton
    @Provides
    DownloadManager provideDownloadManager(@ApplicationContext Context context) {
        return (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
    }

    @Singleton
    @Provides
    DropBoxManager provideDropboxManager(@ApplicationContext Context context) {
        return (DropBoxManager) context.getSystemService(Context.DROPBOX_SERVICE);
    }


    @Singleton
    @Provides
    InputMethodManager provideInputMethodManager(@ApplicationContext Context context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }


    @Singleton
    @Provides
    LayoutInflater provideLayoutInflater(@ApplicationContext Context context) {
        return (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Singleton
    @Provides
    JobScheduler provideJobScheduler(@ApplicationContext Context context) {
        return (JobScheduler) context.getSystemService(Context.JOB_SCHEDULER_SERVICE);
    }


    @Singleton
    @Provides
    LocationManager provideLocationManager(@ApplicationContext Context context) {
        return (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
    }


    @Singleton
    @Provides
    NfcManager provideNFCManager(@ApplicationContext Context context) {
        return (NfcManager) context.getSystemService(Context.NFC_SERVICE);
    }


    @Singleton
    @Provides
    NotificationManager provideNotificationManager(@ApplicationContext Context context) {
        return (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }


    @Singleton
    @Provides
    Vibrator provideVibratorManager(@ApplicationContext Context context) {
        return (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    }


    @Singleton
    @Provides
    WifiManager provideWifiManager(@ApplicationContext Context context) {
        return (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
    }


    @Singleton
    @Provides
    WindowManager provideWindowManager(@ApplicationContext Context context) {
        return (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
    }
}
