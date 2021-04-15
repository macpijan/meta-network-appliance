DESCRIPTION = "Network Appliance - Router - image with Docker support"

IMAGE_FEATURES += "ssh-server-openssh debug-tweaks"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL_append = " \
  packagegroup-na-router-network \
  packagegroup-na-router-firmware \
  packagegroup-na-router-system \
  packagegroup-na-router-utils \
  packagegroup-na-webui-base \
  packagegroup-na-webui-docker \
"
