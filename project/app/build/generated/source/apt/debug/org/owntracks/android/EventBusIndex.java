package org.owntracks.android;

import org.greenrobot.eventbus.meta.SimpleSubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberMethodInfo;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.Map;

/** This class is generated by EventBus, do not edit. */
public class EventBusIndex implements SubscriberInfoIndex {
    private static final Map<Class<?>, SubscriberInfo> SUBSCRIBER_INDEX;

    static {
        SUBSCRIBER_INDEX = new HashMap<Class<?>, SubscriberInfo>();

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.ui.map.MapViewModel.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.model.FusedContact.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.ModeChanged.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(App.class, true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", org.owntracks.android.support.Events.ModeChanged.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.BrokerChanged.class),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.services.ServiceNotification.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.Dummy.class),
            new SubscriberMethodInfo("onEventMainThread", org.owntracks.android.support.Events.ModeChanged.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    org.owntracks.android.support.Events.EndpointStateChanged.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.PermissionGranted.class),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.messages.MessageLocation.class),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.activities.ActivityPreferences.FragmentPreferences.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.ModeChanged.class,
                    ThreadMode.POSTING, 0, true),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.activities.ActivityPreferencesConnection.FragmentPreferences.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.EndpointStateChanged.class,
                    ThreadMode.MAIN, 0, true),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.support.interfaces.ProxyableService.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.Dummy.class),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.services.ServiceMessage.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.Dummy.class),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.ModeChanged.class),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.activities.ActivityRegions.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", org.owntracks.android.support.Events.WaypointAdded.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    org.owntracks.android.support.Events.WaypointTransition.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", org.owntracks.android.support.Events.WaypointRemoved.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", org.owntracks.android.support.Events.WaypointUpdated.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.services.ServiceBeacon.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.Dummy.class),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.WaypointAdded.class),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.WaypointUpdated.class),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.WaypointRemoved.class),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.services.ServiceLocator.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.Dummy.class),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.WaypointAdded.class,
                    ThreadMode.BACKGROUND),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.WaypointUpdated.class,
                    ThreadMode.BACKGROUND),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.WaypointRemoved.class,
                    ThreadMode.BACKGROUND),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.ModeChanged.class),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.PermissionGranted.class),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.ui.status.StatusViewModel.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.EndpointStateChanged.class,
                    ThreadMode.POSTING, 0, true),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.PermissionGranted.class,
                    ThreadMode.POSTING, 0, true),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.AppStarted.class,
                    ThreadMode.POSTING, 0, true),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.ServiceStarted.class,
                    ThreadMode.POSTING, 0, true),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.CurrentLocationUpdated.class,
                    ThreadMode.POSTING, 0, true),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.services.ServiceMessageMqtt.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.Dummy.class),
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.BrokerChanged.class),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.ui.map.MapActivity.MapLocationSource.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("update", org.owntracks.android.support.Events.CurrentLocationUpdated.class,
                    ThreadMode.MAIN, 1, false),
        }));

        putIndex(new SimpleSubscriberInfo(org.owntracks.android.services.ServiceMessageHttp.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", org.owntracks.android.support.Events.Dummy.class),
        }));

    }

    private static void putIndex(SubscriberInfo info) {
        SUBSCRIBER_INDEX.put(info.getSubscriberClass(), info);
    }

    @Override
    public SubscriberInfo getSubscriberInfo(Class<?> subscriberClass) {
        SubscriberInfo info = SUBSCRIBER_INDEX.get(subscriberClass);
        if (info != null) {
            return info;
        } else {
            return null;
        }
    }
}
