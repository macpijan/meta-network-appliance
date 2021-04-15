require conf/distro/poky.conf

DISTRO = "na-router-distro"

# distro name
DISTRO_NAME = "Network Appliance - Router Distro"
DISTRO_VERSION = "0.1.0"
SDK_VENDOR = "-narsdk"

MAINTAINER = "Maciej Pijanowski <maciej.pijanowski@3mdeb.com>"

TARGET_VENDOR = "-nar"

# distro features
DISTRO_FEATURES = "${DISTRO_FEATURES_DEFAULT} systemd pam"
DISTRO_FEATURES_remove = " alsa bluetooth pcmcia zeroconf x11 wayland nfc"

# explictely use systemd and disable sysvinit completely
VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_initscripts = ""
VIRTUAL-RUNTIME_syslog = ""
DISTRO_FEATURES_BACKFILL_CONSIDERED += "sysvinit pulseaudio"

WKS_FILES = "otab-grub-x86-legacy.wks.in"
